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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledBaseline" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnabledBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the <code>EnabledBaseline</code> resource to be retrieved, in ARN format.
     * </p>
     */
    private String enabledBaselineIdentifier;

    /**
     * <p>
     * Identifier of the <code>EnabledBaseline</code> resource to be retrieved, in ARN format.
     * </p>
     * 
     * @param enabledBaselineIdentifier
     *        Identifier of the <code>EnabledBaseline</code> resource to be retrieved, in ARN format.
     */

    public void setEnabledBaselineIdentifier(String enabledBaselineIdentifier) {
        this.enabledBaselineIdentifier = enabledBaselineIdentifier;
    }

    /**
     * <p>
     * Identifier of the <code>EnabledBaseline</code> resource to be retrieved, in ARN format.
     * </p>
     * 
     * @return Identifier of the <code>EnabledBaseline</code> resource to be retrieved, in ARN format.
     */

    public String getEnabledBaselineIdentifier() {
        return this.enabledBaselineIdentifier;
    }

    /**
     * <p>
     * Identifier of the <code>EnabledBaseline</code> resource to be retrieved, in ARN format.
     * </p>
     * 
     * @param enabledBaselineIdentifier
     *        Identifier of the <code>EnabledBaseline</code> resource to be retrieved, in ARN format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledBaselineRequest withEnabledBaselineIdentifier(String enabledBaselineIdentifier) {
        setEnabledBaselineIdentifier(enabledBaselineIdentifier);
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
        if (getEnabledBaselineIdentifier() != null)
            sb.append("EnabledBaselineIdentifier: ").append(getEnabledBaselineIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnabledBaselineRequest == false)
            return false;
        GetEnabledBaselineRequest other = (GetEnabledBaselineRequest) obj;
        if (other.getEnabledBaselineIdentifier() == null ^ this.getEnabledBaselineIdentifier() == null)
            return false;
        if (other.getEnabledBaselineIdentifier() != null && other.getEnabledBaselineIdentifier().equals(this.getEnabledBaselineIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabledBaselineIdentifier() == null) ? 0 : getEnabledBaselineIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetEnabledBaselineRequest clone() {
        return (GetEnabledBaselineRequest) super.clone();
    }

}
