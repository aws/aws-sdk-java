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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteVPCConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVPCConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the account where you want to delete a VPC connection.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     */
    private String vPCConnectionId;

    /**
     * <p>
     * The Amazon Web Services account ID of the account where you want to delete a VPC connection.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID of the account where you want to delete a VPC connection.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account where you want to delete a VPC connection.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the account where you want to delete a VPC connection.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account where you want to delete a VPC connection.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID of the account where you want to delete a VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVPCConnectionRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web
     *        Services Region in an Amazon Web Services account.
     */

    public void setVPCConnectionId(String vPCConnectionId) {
        this.vPCConnectionId = vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     * 
     * @return The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web
     *         Services Region in an Amazon Web Services account.
     */

    public String getVPCConnectionId() {
        return this.vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services
     * Region in an Amazon Web Services account.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web
     *        Services Region in an Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVPCConnectionRequest withVPCConnectionId(String vPCConnectionId) {
        setVPCConnectionId(vPCConnectionId);
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
        if (getVPCConnectionId() != null)
            sb.append("VPCConnectionId: ").append(getVPCConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVPCConnectionRequest == false)
            return false;
        DeleteVPCConnectionRequest other = (DeleteVPCConnectionRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getVPCConnectionId() == null ^ this.getVPCConnectionId() == null)
            return false;
        if (other.getVPCConnectionId() != null && other.getVPCConnectionId().equals(this.getVPCConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getVPCConnectionId() == null) ? 0 : getVPCConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVPCConnectionRequest clone() {
        return (DeleteVPCConnectionRequest) super.clone();
    }

}
