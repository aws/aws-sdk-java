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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an error when an asynchronous operation fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ErrorDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required access
     * permissions for Amazon EKS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     * </p>
     * </li>
     * </ul>
     */
    private String errorCode;
    /**
     * <p>
     * A more complete description of the error.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * An optional field that contains the resource IDs associated with the error.
     * </p>
     */
    private java.util.List<String> resourceIds;

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required access
     * permissions for Amazon EKS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        A brief description of the error. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required
     *        access permissions for Amazon EKS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     *        </p>
     *        </li>
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required access
     * permissions for Amazon EKS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A brief description of the error. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required
     *         access permissions for Amazon EKS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     *         </p>
     *         </li>
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required access
     * permissions for Amazon EKS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        A brief description of the error. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required
     *        access permissions for Amazon EKS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required access
     * permissions for Amazon EKS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        A brief description of the error. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SubnetNotFound</b>: One of the subnets associated with the cluster could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecurityGroupNotFound</b>: One of the security groups associated with the cluster could not be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EniLimitReached</b>: You have reached the elastic network interface limit for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IpNotAvailable</b>: A subnet associated with the cluster does not have any free IP addresses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AccessDenied</b>: You do not have permissions to perform the specified operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OperationNotPermitted</b>: The service role associated with the cluster does not have the required
     *        access permissions for Amazon EKS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VpcIdNotFound</b>: The VPC associated with the cluster could not be found.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorDetail withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * A more complete description of the error.
     * </p>
     * 
     * @param errorMessage
     *        A more complete description of the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A more complete description of the error.
     * </p>
     * 
     * @return A more complete description of the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A more complete description of the error.
     * </p>
     * 
     * @param errorMessage
     *        A more complete description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetail withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * An optional field that contains the resource IDs associated with the error.
     * </p>
     * 
     * @return An optional field that contains the resource IDs associated with the error.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * An optional field that contains the resource IDs associated with the error.
     * </p>
     * 
     * @param resourceIds
     *        An optional field that contains the resource IDs associated with the error.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * An optional field that contains the resource IDs associated with the error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        An optional field that contains the resource IDs associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetail withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional field that contains the resource IDs associated with the error.
     * </p>
     * 
     * @param resourceIds
     *        An optional field that contains the resource IDs associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorDetail withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorDetail == false)
            return false;
        ErrorDetail other = (ErrorDetail) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public ErrorDetail clone() {
        try {
            return (ErrorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ErrorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
