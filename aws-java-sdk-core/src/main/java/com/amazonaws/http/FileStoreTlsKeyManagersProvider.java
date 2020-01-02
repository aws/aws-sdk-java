/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import com.amazonaws.util.ValidationUtils;
import java.io.File;
import javax.net.ssl.KeyManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implementation of {@link TlsKeyManagersProvider} that loads from a given file path.
 */
public final class FileStoreTlsKeyManagersProvider extends AbstractFileTlsKeyManagersProvider {
    private static final Log log = LogFactory.getLog(FileStoreTlsKeyManagersProvider.class);

    private final File storePath;
    private final String storeType;
    private final char[] password;

    public FileStoreTlsKeyManagersProvider(File storePath, String storeType, String password) {
        this.storePath = ValidationUtils.assertNotNull(storePath, "storePath");
        this.storeType = ValidationUtils.assertStringNotEmpty(storeType, "storeType");
        this.password = password != null ? password.toCharArray() : null;
    }

    @Override
    public KeyManager[] getKeyManagers() {
        try {
            return createKeyManagers(storePath, storeType, password);
        } catch (Exception e) {
            if (log.isWarnEnabled()) {
                log.warn(String.format("Unable to create KeyManagers from file %s", storePath.getAbsolutePath()), e);
            }
            return null;
        }
    }
}
