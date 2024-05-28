/*
 * Copyright 2014-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import com.amazonaws.util.DateUtils;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.Platform;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.ValidationUtils;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;

/**
 * A credentials provider that can load credentials from an external process. This is used to support the credential_process
 * setting in the profile credentials file. See
 * https://docs.aws.amazon.com/cli/latest/topic/config-vars.html#sourcing-credentials-from-external-processes for more
 * information.
 *
 * Created using {@link #builder()}.
 *
 * Available settings:
 * <ul>
 *     <li>Command - The command that should be executed to retrieve credentials.</li>
 *     <li>ExpirationBuffer - The amount of time between when the credentials expire and when the credentials should start to be
 *     refreshed. This allows the credentials to be refreshed *before* they are reported to expire. Default: 15 seconds.</li>
 *     <li>ProcessOutputLimit - The maximum amount of data that can be returned by the external process before an exception is
 *     raised. Default: 64000 bytes.</li>
 * </ul>
 *
 * <p>
 * <b>Migrating to the AWS SDK for Java v2</b>
 * <p>
 * The v2 equivalent of this class is
 * <a href="https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/auth/credentials/ProcessCredentialsProvider.html">ProcessCredentialsProvider</a>
 *
 * <p>
 * See <a href="https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/migration-client-credentials.html">Migration Guide</a>
 * for more information.
 */
public final class ProcessCredentialsProvider implements AWSCredentialsProvider {

    private static final String PROVIDER_NAME = "ProcessCredentialsProvider";

    private final List<String> command;
    private final int expirationBufferValue;
    private final TimeUnit expirationBufferUnit;
    private final long processOutputLimit;

    private final Object credentialLock = new Object();

    private volatile AWSCredentials credentials = null;
    private volatile DateTime credentialExpirationTime = DateTime.now();

    /**
     * @see #builder()
     */
    private ProcessCredentialsProvider(Builder builder) {
        this.command = executableCommand(builder);
        this.processOutputLimit = ValidationUtils.assertNotNull(builder.processOutputLimit, "processOutputLimit");
        this.expirationBufferValue = ValidationUtils.assertNotNull(builder.expirationBufferValue, "expirationBufferValue");
        this.expirationBufferUnit = ValidationUtils.assertNotNull(builder.expirationBufferUnit, "expirationBufferUnit");
    }

    private List<String> executableCommand(Builder builder) {
        if (builder.commandAsListOfStrings != null) {
            return Collections.unmodifiableList(builder.commandAsListOfStrings);
        } else {
            List<String> cmd = new ArrayList<String>();

            if (Platform.isWindows()) {
                cmd.add("cmd.exe");
                cmd.add("/C");
            } else {
                cmd.add("sh");
                cmd.add("-c");
            }

            String builderCommand = ValidationUtils.assertNotNull(builder.command, "command");
            cmd.add(builderCommand);
            return Collections.unmodifiableList(cmd);
        }
    }

    /**
     * Retrieve a new builder that can be used to create and configure a {@link ProcessCredentialsProvider}.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public AWSCredentials getCredentials() {
        if (credentialsNeedUpdating()) {
            synchronized (credentialLock) {
                if (credentialsNeedUpdating()) {
                    refresh();
                }
            }
        }

        return credentials;
    }

    @Override
    public void refresh() {
        try {
            String processOutput = executeCommand();
            JsonNode credentialsJson = parseProcessOutput(processOutput);

            AWSCredentials credentials = credentials(credentialsJson);
            DateTime credentialExpirationTime = credentialExpirationTime(credentialsJson);

            this.credentials = credentials;
            this.credentialExpirationTime = credentialExpirationTime;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Process-based credential refreshing has been interrupted.", e);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to refresh process-based credentials.", e);
        }
    }

    /**
     * Get the time at which this credentials provider will block to refresh the credentials. This is usually the expiration time
     * returned by the credentials process, minus the configured expiration buffer.
     */
    public DateTime getCredentialExpirationTime() {
        return credentialExpirationTime;
    }

    /**
     * Determine whether the current state of the credentials warrant refreshing.
     */
    private boolean credentialsNeedUpdating() {
        return credentials == null || credentialExpirationTime.isBeforeNow();
    }

    /**
     * Parse the output from the credentials process.
     */
    private JsonNode parseProcessOutput(String processOutput) {
        JsonNode credentialsJson = Jackson.fromSensitiveJsonString(processOutput, JsonNode.class);

        if (!credentialsJson.isObject()) {
            throw new IllegalStateException("Process did not return a JSON object.");
        }

        JsonNode version = credentialsJson.get("Version");
        if (version == null || !version.isInt() || version.asInt() != 1) {
            throw new IllegalStateException("Unsupported credential version: " + version);
        }
        return credentialsJson;
    }

    /**
     * Parse the process output to retrieve the credentials.
     */
    private AWSCredentials credentials(JsonNode credentialsJson) {
        String accessKeyId = getText(credentialsJson, "AccessKeyId");
        String secretAccessKey = getText(credentialsJson, "SecretAccessKey");
        String sessionToken = getText(credentialsJson, "SessionToken");

        ValidationUtils.assertStringNotEmpty(accessKeyId, "AccessKeyId");
        ValidationUtils.assertStringNotEmpty(secretAccessKey, "SecretAccessKey");

        if (sessionToken != null) {
            return new BasicSessionCredentials(accessKeyId, secretAccessKey, sessionToken, null, PROVIDER_NAME);
        } else {
            return new BasicAWSCredentials(accessKeyId, secretAccessKey, null, PROVIDER_NAME);
        }
    }

    /**
     * Parse the process output to retrieve the expiration date and time. The result includes any configured expiration buffer.
     */
    private DateTime credentialExpirationTime(JsonNode credentialsJson) {
        String expiration = getText(credentialsJson, "Expiration");

        if (expiration != null) {
            DateTime credentialExpiration = new DateTime(DateUtils.parseISO8601Date(expiration));
            credentialExpiration = credentialExpiration.minus(expirationBufferUnit.toMillis(expirationBufferValue));
            return credentialExpiration;
        } else {
            return DateTime.now().plusYears(9999);
        }
    }

    /**
     * Get a textual value from a json object, throwing an exception if the node is missing or not textual.
     */
    private String getText(JsonNode jsonObject, String nodeName) {
        JsonNode subNode = jsonObject.get(nodeName);

        if (subNode == null) {
            return null;
        }

        if (!subNode.isTextual()) {
            throw new IllegalStateException(nodeName + " from credential process should be textual, but was " +
                                            subNode.getNodeType());
        }

        return subNode.asText();
    }

    /**
     * Execute the external process to retrieve credentials.
     */
    private String executeCommand() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder(command);

        ByteArrayOutputStream commandOutput = new ByteArrayOutputStream();

        Process process = processBuilder.start();
        try {
            IOUtils.copy(process.getInputStream(), commandOutput, processOutputLimit);

            process.waitFor();

            if (process.exitValue() != 0) {
                throw new IllegalStateException("Command returned non-zero exit value: " + process.exitValue());
            }

            return new String(commandOutput.toByteArray(), StringUtils.UTF8);
        } finally {
            process.destroy();
        }
    }

    /**
     * Used to configure and create a {@link ProcessCredentialsProvider}. See {@link #builder()} creation.
     */
    public static class Builder {
        private String command;
        private List<String> commandAsListOfStrings;
        private int expirationBufferValue = 15;
        private TimeUnit expirationBufferUnit = TimeUnit.SECONDS;
        private long processOutputLimit = 64000;

        /**
         * @see #builder()
         */
        private Builder() {}

        /**
         * Configure the command that should be executed to retrieve credentials.
         * See {@link ProcessBuilder} for details on how this command is used.
         *
         * @deprecated The recommended approach is to specify the command as a list of Strings, using
         * {@link #setCommand(List)} instead, which makes it easier to programmatically add parameters to commands
         * without needing to escape those parameters to protect against command injection.
         */
        @Deprecated
        private void setCommand(String command) {
            this.command = command;
        }

        /**
         * Configure the command that should be executed to retrieve credentials and return this Builder.
         * See {@link ProcessBuilder} for details on how this command is used.
         *
         * @deprecated The recommended approach is to specify the command as a list of Strings, using
         * {@link #withCommand(List)} instead, which makes it easier to programmatically add parameters to commands
         * without needing to escape those parameters to protect against command injection.
         */
        @Deprecated
        public Builder withCommand(String command) {
            setCommand(command);
            return this;
        }

        /**
         * Configure the command that should be executed to retrieve credentials, as a list of strings.
         * See {@link ProcessBuilder} for details on how this command is used.
         */
        private void setCommand(List<String> commandAsListOfStrings) {
            this.commandAsListOfStrings = commandAsListOfStrings;
        }

        /**
         * @see #setCommand(List)
         */
        public Builder withCommand(List<String> commands) {
            setCommand(commands);
            return this;
        }

        /**
         * Configure the amount of time between when the credentials expire and when the credentials should start to be
         * refreshed. This allows the credentials to be refreshed *before* they are reported to expire.
         *
         * Default: 15 seconds.
         */
        public void setCredentialExpirationBuffer(int value, TimeUnit unit) {
            this.expirationBufferValue = value;
            this.expirationBufferUnit = unit;
        }

        /**
         * @see #setCredentialExpirationBuffer(int, TimeUnit)
         */
        public Builder withCredentialExpirationBuffer(int value, TimeUnit unit) {
            setCredentialExpirationBuffer(value, unit);
            return this;
        }

        /**
         * Configure the maximum amount of data that can be returned by the external process before an exception is
         * raised.
         *
         * Default: 64000 bytes.
         */
        private void setProcessOutputLimit(long outputByteLimit) {
            this.processOutputLimit = outputByteLimit;
        }

        /**
         * @see #setProcessOutputLimit(long)
         */
        public Builder withProcessOutputLimit(long outputByteLimit) {
            setProcessOutputLimit(outputByteLimit);
            return this;
        }

        public ProcessCredentialsProvider build() {
            return new ProcessCredentialsProvider(this);
        }
    }
}
