/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetSignedBluinsightsUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSignedBluinsightsUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Single sign-on AWS Blu Insights URL.
     * </p>
     */
    private String signedBiUrl;

    /**
     * <p>
     * Single sign-on AWS Blu Insights URL.
     * </p>
     * 
     * @param signedBiUrl
     *        Single sign-on AWS Blu Insights URL.
     */

    public void setSignedBiUrl(String signedBiUrl) {
        this.signedBiUrl = signedBiUrl;
    }

    /**
     * <p>
     * Single sign-on AWS Blu Insights URL.
     * </p>
     * 
     * @return Single sign-on AWS Blu Insights URL.
     */

    public String getSignedBiUrl() {
        return this.signedBiUrl;
    }

    /**
     * <p>
     * Single sign-on AWS Blu Insights URL.
     * </p>
     * 
     * @param signedBiUrl
     *        Single sign-on AWS Blu Insights URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSignedBluinsightsUrlResult withSignedBiUrl(String signedBiUrl) {
        setSignedBiUrl(signedBiUrl);
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
        if (getSignedBiUrl() != null)
            sb.append("SignedBiUrl: ").append(getSignedBiUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSignedBluinsightsUrlResult == false)
            return false;
        GetSignedBluinsightsUrlResult other = (GetSignedBluinsightsUrlResult) obj;
        if (other.getSignedBiUrl() == null ^ this.getSignedBiUrl() == null)
            return false;
        if (other.getSignedBiUrl() != null && other.getSignedBiUrl().equals(this.getSignedBiUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignedBiUrl() == null) ? 0 : getSignedBiUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetSignedBluinsightsUrlResult clone() {
        try {
            return (GetSignedBluinsightsUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
