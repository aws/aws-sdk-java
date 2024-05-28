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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteRedshiftIdcApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRedshiftIdcApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for a deleted Amazon Redshift IAM Identity Center application.
     * </p>
     */
    private String redshiftIdcApplicationArn;

    /**
     * <p>
     * The ARN for a deleted Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param redshiftIdcApplicationArn
     *        The ARN for a deleted Amazon Redshift IAM Identity Center application.
     */

    public void setRedshiftIdcApplicationArn(String redshiftIdcApplicationArn) {
        this.redshiftIdcApplicationArn = redshiftIdcApplicationArn;
    }

    /**
     * <p>
     * The ARN for a deleted Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @return The ARN for a deleted Amazon Redshift IAM Identity Center application.
     */

    public String getRedshiftIdcApplicationArn() {
        return this.redshiftIdcApplicationArn;
    }

    /**
     * <p>
     * The ARN for a deleted Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param redshiftIdcApplicationArn
     *        The ARN for a deleted Amazon Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRedshiftIdcApplicationRequest withRedshiftIdcApplicationArn(String redshiftIdcApplicationArn) {
        setRedshiftIdcApplicationArn(redshiftIdcApplicationArn);
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
        if (getRedshiftIdcApplicationArn() != null)
            sb.append("RedshiftIdcApplicationArn: ").append(getRedshiftIdcApplicationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRedshiftIdcApplicationRequest == false)
            return false;
        DeleteRedshiftIdcApplicationRequest other = (DeleteRedshiftIdcApplicationRequest) obj;
        if (other.getRedshiftIdcApplicationArn() == null ^ this.getRedshiftIdcApplicationArn() == null)
            return false;
        if (other.getRedshiftIdcApplicationArn() != null && other.getRedshiftIdcApplicationArn().equals(this.getRedshiftIdcApplicationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedshiftIdcApplicationArn() == null) ? 0 : getRedshiftIdcApplicationArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRedshiftIdcApplicationRequest clone() {
        return (DeleteRedshiftIdcApplicationRequest) super.clone();
    }

}
