/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that you want to delete the QuickSight namespace from.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace that you want to delete.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The ID for the AWS account that you want to delete the QuickSight namespace from.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to delete the QuickSight namespace from.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to delete the QuickSight namespace from.
     * </p>
     * 
     * @return The ID for the AWS account that you want to delete the QuickSight namespace from.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to delete the QuickSight namespace from.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to delete the QuickSight namespace from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNamespaceRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace that you want to delete.
     * </p>
     * 
     * @param namespace
     *        The namespace that you want to delete.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace that you want to delete.
     * </p>
     * 
     * @return The namespace that you want to delete.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace that you want to delete.
     * </p>
     * 
     * @param namespace
     *        The namespace that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNamespaceRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNamespaceRequest == false)
            return false;
        DeleteNamespaceRequest other = (DeleteNamespaceRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNamespaceRequest clone() {
        return (DeleteNamespaceRequest) super.clone();
    }

}
