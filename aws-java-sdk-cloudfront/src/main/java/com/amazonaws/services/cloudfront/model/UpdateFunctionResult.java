/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains configuration information and metadata about a CloudFront function.
     * </p>
     */
    private FunctionSummary functionSummary;
    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Contains configuration information and metadata about a CloudFront function.
     * </p>
     * 
     * @param functionSummary
     *        Contains configuration information and metadata about a CloudFront function.
     */

    public void setFunctionSummary(FunctionSummary functionSummary) {
        this.functionSummary = functionSummary;
    }

    /**
     * <p>
     * Contains configuration information and metadata about a CloudFront function.
     * </p>
     * 
     * @return Contains configuration information and metadata about a CloudFront function.
     */

    public FunctionSummary getFunctionSummary() {
        return this.functionSummary;
    }

    /**
     * <p>
     * Contains configuration information and metadata about a CloudFront function.
     * </p>
     * 
     * @param functionSummary
     *        Contains configuration information and metadata about a CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionResult withFunctionSummary(FunctionSummary functionSummary) {
        setFunctionSummary(functionSummary);
        return this;
    }

    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the CloudFront function.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     * 
     * @return The version identifier for the current version of the CloudFront function.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionResult withETag(String eTag) {
        setETag(eTag);
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
        if (getFunctionSummary() != null)
            sb.append("FunctionSummary: ").append(getFunctionSummary()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionResult == false)
            return false;
        UpdateFunctionResult other = (UpdateFunctionResult) obj;
        if (other.getFunctionSummary() == null ^ this.getFunctionSummary() == null)
            return false;
        if (other.getFunctionSummary() != null && other.getFunctionSummary().equals(this.getFunctionSummary()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionSummary() == null) ? 0 : getFunctionSummary().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionResult clone() {
        try {
            return (UpdateFunctionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
