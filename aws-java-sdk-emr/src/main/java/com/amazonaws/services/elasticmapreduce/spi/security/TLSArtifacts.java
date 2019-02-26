/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticmapreduce.spi.security;

import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.List;

/**
 * TLS artifacts that can be used to do in-transit encryption.
 * Private key and certificate chain are mandatory while certificates
 * for trusted CA are optional.
 */
public class TLSArtifacts {
  private final PrivateKey privateKey;
  private final List<Certificate> trustedCertificates;
  private final List<Certificate> certificateChain;

  public TLSArtifacts(PrivateKey privateKey, List<Certificate> certificateChain) {
    this(privateKey, certificateChain, null);
  }

  public TLSArtifacts(PrivateKey privateKey,
                      List<Certificate> certificateChain,
                      List<Certificate> trustedCertificates) {

    this.privateKey = privateKey;
    this.certificateChain = certificateChain;
    this.trustedCertificates = trustedCertificates;
  }

  /**
   * Gets the private key in the TLSArtifacts object.
   * @return the private key.
   */
  public PrivateKey getPrivateKey() {
    return privateKey;
  }

  /**
   * Gets the trusted CA certificates in the TLSArtifacts object.
   * @return trusted CA certificates.
   */
  public List<Certificate> getTrustedCertificates() {
    return trustedCertificates;
  }

  /**
   * Gets the certificate chain for private key in the TLSArtifacts object.
   * @return certificate chain.
   */
  public List<Certificate> getCertificateChain() {
    return certificateChain;
  }
}
