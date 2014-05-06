/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.profile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.internal.AbstractProfilesConfigFileScanner;
import com.amazonaws.auth.profile.internal.Profile;

/**
 * The class for creating and modifying the credential profiles file.
 */
public class ProfilesConfigFileWriter {

    private static final Log LOG = LogFactory.getLog(ProfilesConfigFileWriter.class);

    /**
     * Write all the credential profiles to a file. Note that this method will
     * clobber the existing content in the destination file if it's in the
     * overwrite mode. Use {@link #modifyOrInsertProfiles(File, Profile...)}
     * instead, if you want to perform in-place modification on your existing
     * credentials file.
     *
     * @param destination
     *            The destination file where the credentials will be written to.
     * @param overwrite
     *            If true, this method If false, this method will throw
     *            exception if the file already exists.
     * @param profiles
     *            All the credential profiles to be written.
     */
    public static void dumpToFile(File destination, boolean overwrite, Profile... profiles) {
        if (destination.exists() && !overwrite) {
            throw new AmazonClientException(
                    "The destination file already exists. " +
                    "Set overwrite=true if you want to clobber the existing " +
                    "content and completely re-write the file.");
        }

        FileWriter writer;
        try {
            writer = new FileWriter(destination, false); // append=false
        } catch (IOException ioe) {
            throw new AmazonClientException(
                    "Unable to open the destination file.", ioe);
        }

        try {
            ProfilesConfigFileWriterHelper writerHelper = new ProfilesConfigFileWriterHelper(writer, profiles);

            writerHelper.writeWithoutExistingContent();
        } finally {
            try { writer.close(); } catch (IOException ioe) {}
        }

    }

    /**
     * Modify or insert new profiles into an existing credentials file by
     * in-place modification. Only the properties of the affected profiles will
     * be modified; all the unaffected profiles and comment lines will remain
     * the same.
     *
     * @param destination
     *            The destination file to modify
     * @param profiles
     *            All the credential profiles to be written.
     */
    public static void modifyOrInsertProfiles(File destination, Profile... profiles) {
        final boolean inPlaceModify = destination.exists();
        File stashLocation = null;

        // Stash the original file, before we apply the changes
        if (inPlaceModify) {
            boolean stashed = false;

            try {
                // We can't use File.createTempFile, since it will always create
                // that file no matter what, and File.reNameTo does not allow
                // the destination to be an existing file
                stashLocation = new File(destination.getParentFile(),
                        destination.getName() + ".bak."
                                + UUID.randomUUID().toString());
                stashed = destination.renameTo(stashLocation);

                if (LOG.isDebugEnabled()) {
                    LOG.debug(String
                            .format("The original credentials file is stashed to loaction (%s).",
                                    stashLocation.getAbsolutePath()));
                }

            } finally {
                if (!stashed) {
                    throw new AmazonClientException(
                            "Failed to stash the existing credentials file " +
                            "before applying the changes.");
                }
            }
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter(destination);
            ProfilesConfigFileWriterHelper writerHelper = new ProfilesConfigFileWriterHelper(writer, profiles);

            if (inPlaceModify) {
                Scanner existingContent = new Scanner(stashLocation);
                writerHelper.writeWithExistingContent(existingContent);
            } else {
                writerHelper.writeWithoutExistingContent();
            }

        } catch (Exception e) {
            // Restore the stashed file
            if (inPlaceModify) {
                boolean restored = false;

                try {
                    // We don't really care about what destination.delete()
                    // returns, since the file might not have been created when
                    // the error occurred.
                    if ( !destination.delete() ) {
                        LOG.debug("Unable to remove the credentials file "
                                + "before restoring the original one.");
                    }
                    restored = stashLocation.renameTo(destination);
                } finally {
                    if (!restored) {
                        throw new AmazonClientException(
                                "Unable to restore the original credentials file. " +
                                "File content stashed in " + stashLocation.getAbsolutePath());
                    }
                }
            }

            throw new AmazonClientException(
                    "Unable to modify the credentials file. " +
                    "(The original file has been restored.)",
                    e);

        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {}
        }
    }

    /**
     * Implementation of AbstractProfilesConfigFileScanner, which reads the
     * content from an existing credentials file (if any) and then modifies some
     * of the profile properties in place.
     */
    private static class ProfilesConfigFileWriterHelper extends AbstractProfilesConfigFileScanner {

        /** The writer where the modified profiles will be output to */
        private final Writer writer;

        /** Map of all the profiles to be modified, keyed by profile names */
        private final Map<String, Profile> newProfiles;

        private final StringBuilder buffer = new StringBuilder();
        private final Map<String, Set<String>> existingProfiles = new HashMap<String, Set<String>>();

        public ProfilesConfigFileWriterHelper(Writer writer, Profile... newProfiles) {
            Map<String, Profile> newProfilesMap = new LinkedHashMap<String, Profile>();
            for (Profile newProfile : newProfiles) {
                newProfilesMap.put(newProfile.getProfileName(), newProfile);
            }

            this.writer = writer;
            this.newProfiles = newProfilesMap;
        }

        /**
         * Append the new profiles to the writer, by reading from empty content.
         */
        public void writeWithoutExistingContent() {
            buffer.setLength(0);
            existingProfiles.clear();

            // Use empty String as input, since we are bootstrapping a new file.
            run(new Scanner(""));
        }

        /**
         * Read the existing content of a credentials file, and then make
         * in-place modification according to the new profiles specified in this
         * class.
         */
        public void writeWithExistingContent(Scanner existingContent) {
            buffer.setLength(0);
            existingProfiles.clear();

            run(existingContent);
        }

        @Override
        protected void onEmptyOrCommentLine(String line) {
            /*
             * Buffer the line until we reach the next property line or the end
             * of the profile. We do this so that new properties could be
             * inserted at more appropriate location. For example:
             *
             * [default]
             * # access key
             * aws_access_key_id=aaa
             * # secret key
             * aws_secret_access_key=sss
             * # We want new properties to be inserted before this line
             * # instead of after the following empty line
             *
             * [next profile]
             * ...
             */
            buffer(line);
        }

        @Override
        protected void onProfileStartingLine(String newProfileName, String line) {
            existingProfiles.put(newProfileName, new HashSet<String>());

            // Copy the line after flush the buffer
            flush();
            writeLine(line);
        }

        @Override
        protected void onProfileEndingLine(String prevProfileName) {
            // Check whether we need to insert new properties into this profile
            Profile modifiedProfile = newProfiles.get(prevProfileName);
            if (modifiedProfile != null) {
                for (Entry<String, String> entry : modifiedProfile.getProperties().entrySet()) {
                    String propertyKey   = entry.getKey();
                    String propertyValue = entry.getValue();
                    if ( !existingProfiles.get(prevProfileName).contains(propertyKey) ) {
                        writeProperty(propertyKey, propertyValue);
                    }
                }
            }

            // flush all the buffered comments and empty lines
            flush();
        }

        @Override
        protected void onProfileProperty(String profileName,
                String propertyKey, String propertyValue,
                boolean isSupportedProperty, String line) {
            // Record that this property key has been declared for this profile
            if (existingProfiles.get(profileName) == null) {
                existingProfiles.put(profileName, new HashSet<String>());
            }
            existingProfiles.get(profileName).add(propertyKey);

            // Keep the unsupported properties
            if ( !isSupportedProperty ) {
                writeLine(line);
                return;
            }

            // flush all the buffered comments and empty lines before this property line
            flush();

            // Modify the property value
            if (newProfiles.containsKey(profileName)) {
                String newValue = newProfiles.get(profileName)
                        .getPropertyValue(propertyKey);
                if (newValue != null) {
                    writeProperty(propertyKey, newValue);
                }
                // else remove that line
            } else {
                writeLine(line);
            }

        }

        @Override
        protected void onEndOfFile() {
            // Append profiles that don't exist in the original file
            for (Profile newProfile : newProfiles.values()) {
                if ( !existingProfiles.containsKey(newProfile.getProfileName()) ) {
                    writeProfile(newProfile);
                    writeLine("");
                }
            }

            // Flush the "real" writer
            try {
                writer.flush();
            } catch (IOException ioe) {
                throw new AmazonClientException(
                        "Unable to write to the target file to persist the profile credentials.",
                        ioe);
            }
        }

        /* Private interface */

        private void writeProfile(Profile profile) {
            writeProfileName(profile.getProfileName());

            for (Entry<String, String> entry : profile.getProperties().entrySet()) {
                writeProperty(entry.getKey(), entry.getValue());
            }
        }

        private void writeProfileName(String profileName) {
            writeLine(String.format("[%s]", profileName));
        }

        private void writeProperty(String propertyKey, String propertyValue) {
            writeLine(String.format("%s=%s", propertyKey, propertyValue));
        }

        private void writeLine(String line) {
            append(String.format("%s%n", line));
        }

        /**
         * This method handles IOException that occurs when calling the append
         * method on the writer.
         */
        private void append(String str) {
            try {
                writer.append(str);
            } catch (IOException ioe) {
                throw new AmazonClientException(
                        "Unable to write to the target file to persist the profile credentials.",
                        ioe);
            }
        }

        private void flush() {
            if (buffer.length() != 0) {
                append(buffer.toString());
                buffer.setLength(0);
            }
        }

        private void buffer(String line) {
            buffer.append(String.format("%s%n", line));
        }
    }
}
