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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>Baseline</code> resource to be retrieved.
     * </p>
     */
    private String baselineIdentifier;

    /**
     * <p>
     * The ARN of the <code>Baseline</code> resource to be retrieved.
     * </p>
     * 
     * @param baselineIdentifier
     *        The ARN of the <code>Baseline</code> resource to be retrieved.
     */

    public void setBaselineIdentifier(String baselineIdentifier) {
        this.baselineIdentifier = baselineIdentifier;
    }

    /**
     * <p>
     * The ARN of the <code>Baseline</code> resource to be retrieved.
     * </p>
     * 
     * @return The ARN of the <code>Baseline</code> resource to be retrieved.
     */

    public String getBaselineIdentifier() {
        return this.baselineIdentifier;
    }

    /**
     * <p>
     * The ARN of the <code>Baseline</code> resource to be retrieved.
     * </p>
     * 
     * @param baselineIdentifier
     *        The ARN of the <code>Baseline</code> resource to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBaselineRequest withBaselineIdentifier(String baselineIdentifier) {
        setBaselineIdentifier(baselineIdentifier);
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
        if (getBaselineIdentifier() != null)
            sb.append("BaselineIdentifier: ").append(getBaselineIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBaselineRequest == false)
            return false;
        GetBaselineRequest other = (GetBaselineRequest) obj;
        if (other.getBaselineIdentifier() == null ^ this.getBaselineIdentifier() == null)
            return false;
        if (other.getBaselineIdentifier() != null && other.getBaselineIdentifier().equals(this.getBaselineIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineIdentifier() == null) ? 0 : getBaselineIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetBaselineRequest clone() {
        return (GetBaselineRequest) super.clone();
    }

}
