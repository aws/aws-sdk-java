package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;

import java.io.File;
import java.io.IOException;

/**
 * {@link AWSCredentialsProvider} implementation that loads AWS security
 * credentials from a properties file provided on initialization.
 * <p>
 * The AWS access key ID is expected to be in the <code>accessKey</code>
 * property and the AWS secret key is expected to be in the
 * <code>secretKey</code> property.
 */
public class PropertiesFileCredentialsProvider implements AWSCredentialsProvider {

    private final String credentialsFilePath;

    /**
     * Creates a new PropertiesFileCredentialsProvider that will
     * attempt to load a custom file from the path specified to read AWS security
     * credentials.
     *
     * @param credentialsFilePath
     *            The custom classpath resource path to a properties file
     *            from which the AWS security credentials should be loaded.
     *
     *            For example,
     *            <ul>
     *              <li>/etc/somewhere/credentials.properties</li>
     *              <li>./beta-credentials.properties</li>
     *              <li>./AwsCredentials.properties</li>
     *            </ul>
     */
    public PropertiesFileCredentialsProvider(String credentialsFilePath) {
        if (credentialsFilePath == null)
            throw new IllegalArgumentException("Credentials file path cannot be null");
            this.credentialsFilePath = credentialsFilePath;
    }

    public AWSCredentials getCredentials() {
        try {
            return new PropertiesCredentials(new File(this.credentialsFilePath));
        } catch (IOException e) {
            throw new AmazonClientException("Unable to load AWS credentials from the " + credentialsFilePath + " file", e);
        }
    }

    public void refresh() {}

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + credentialsFilePath + ")";
    }
}
