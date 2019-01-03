/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an
 * external domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/VerifyTrust" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyTrustRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Trust ID of the trust relationship to verify.
     * </p>
     */
    private String trustId;

    /**
     * <p>
     * The unique Trust ID of the trust relationship to verify.
     * </p>
     * 
     * @param trustId
     *        The unique Trust ID of the trust relationship to verify.
     */

    public void setTrustId(String trustId) {
        this.trustId = trustId;
    }

    /**
     * <p>
     * The unique Trust ID of the trust relationship to verify.
     * </p>
     * 
     * @return The unique Trust ID of the trust relationship to verify.
     */

    public String getTrustId() {
        return this.trustId;
    }

    /**
     * <p>
     * The unique Trust ID of the trust relationship to verify.
     * </p>
     * 
     * @param trustId
     *        The unique Trust ID of the trust relationship to verify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyTrustRequest withTrustId(String trustId) {
        setTrustId(trustId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTrustId() != null)
            sb.append("TrustId: ").append(getTrustId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyTrustRequest == false)
            return false;
        VerifyTrustRequest other = (VerifyTrustRequest) obj;
        if (other.getTrustId() == null ^ this.getTrustId() == null)
            return false;
        if (other.getTrustId() != null && other.getTrustId().equals(this.getTrustId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustId() == null) ? 0 : getTrustId().hashCode());
        return hashCode;
    }

    @Override
    public VerifyTrustRequest clone() {
        return (VerifyTrustRequest) super.clone();
    }

}
