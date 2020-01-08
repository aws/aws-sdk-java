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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Abstract implementation of {@link TlsKeyManagersProvider} that knows how to
 * load a KeyManager from a key store file.
 */
@SdkInternalApi
abstract class AbstractFileTlsKeyManagersProvider implements TlsKeyManagersProvider {
    private static final Log log = LogFactory.getLog(AbstractFileTlsKeyManagersProvider.class);

    protected final KeyManager[] createKeyManagers(File storePath, String storeType, char[] password) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException, UnrecoverableKeyException {
        KeyStore ks = createKeyStore(storePath, storeType, password);
        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(ks, password);
        return kmf.getKeyManagers();
    }

    private KeyStore createKeyStore(File storePath, String storeType, char[] password) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        KeyStore ks = KeyStore.getInstance(storeType);
        InputStream storeIs = null;
        try {
            storeIs = new FileInputStream(storePath);
            ks.load(storeIs, password);
            return ks;
        } finally {
            if (storeIs != null) {
                IOUtils.closeQuietly(storeIs, log);
            }
        }
    }
}
