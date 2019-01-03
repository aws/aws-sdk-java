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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateS3Resources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateS3ResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code and an
     * error message are provided for each failed item.
     * </p>
     */
    private java.util.List<FailedS3Resource> failedS3Resources;

    /**
     * <p>
     * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code and an
     * error message are provided for each failed item.
     * </p>
     * 
     * @return S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code
     *         and an error message are provided for each failed item.
     */

    public java.util.List<FailedS3Resource> getFailedS3Resources() {
        return failedS3Resources;
    }

    /**
     * <p>
     * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code and an
     * error message are provided for each failed item.
     * </p>
     * 
     * @param failedS3Resources
     *        S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code
     *        and an error message are provided for each failed item.
     */

    public void setFailedS3Resources(java.util.Collection<FailedS3Resource> failedS3Resources) {
        if (failedS3Resources == null) {
            this.failedS3Resources = null;
            return;
        }

        this.failedS3Resources = new java.util.ArrayList<FailedS3Resource>(failedS3Resources);
    }

    /**
     * <p>
     * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code and an
     * error message are provided for each failed item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedS3Resources(java.util.Collection)} or {@link #withFailedS3Resources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param failedS3Resources
     *        S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code
     *        and an error message are provided for each failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateS3ResourcesResult withFailedS3Resources(FailedS3Resource... failedS3Resources) {
        if (this.failedS3Resources == null) {
            setFailedS3Resources(new java.util.ArrayList<FailedS3Resource>(failedS3Resources.length));
        }
        for (FailedS3Resource ele : failedS3Resources) {
            this.failedS3Resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code and an
     * error message are provided for each failed item.
     * </p>
     * 
     * @param failedS3Resources
     *        S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code
     *        and an error message are provided for each failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateS3ResourcesResult withFailedS3Resources(java.util.Collection<FailedS3Resource> failedS3Resources) {
        setFailedS3Resources(failedS3Resources);
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
        if (getFailedS3Resources() != null)
            sb.append("FailedS3Resources: ").append(getFailedS3Resources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateS3ResourcesResult == false)
            return false;
        DisassociateS3ResourcesResult other = (DisassociateS3ResourcesResult) obj;
        if (other.getFailedS3Resources() == null ^ this.getFailedS3Resources() == null)
            return false;
        if (other.getFailedS3Resources() != null && other.getFailedS3Resources().equals(this.getFailedS3Resources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedS3Resources() == null) ? 0 : getFailedS3Resources().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateS3ResourcesResult clone() {
        try {
            return (DisassociateS3ResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
