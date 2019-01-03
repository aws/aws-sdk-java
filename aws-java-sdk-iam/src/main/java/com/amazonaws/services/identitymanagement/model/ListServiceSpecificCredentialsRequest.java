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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListServiceSpecificCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceSpecificCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user whose service-specific credentials you want information about. If this value is not
     * specified, then the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns
     * service-specific credentials for all services.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the user whose service-specific credentials you want information about. If this value is not
     * specified, then the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user whose service-specific credentials you want information about. If this value is not
     *        specified, then the operation assumes the user whose credentials are used to call the operation.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose service-specific credentials you want information about. If this value is not
     * specified, then the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the user whose service-specific credentials you want information about. If this value is not
     *         specified, then the operation assumes the user whose credentials are used to call the operation.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user whose service-specific credentials you want information about. If this value is not
     * specified, then the operation assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user whose service-specific credentials you want information about. If this value is not
     *        specified, then the operation assumes the user whose credentials are used to call the operation.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceSpecificCredentialsRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns
     * service-specific credentials for all services.
     * </p>
     * 
     * @param serviceName
     *        Filters the returned results to only those for the specified AWS service. If not specified, then AWS
     *        returns service-specific credentials for all services.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns
     * service-specific credentials for all services.
     * </p>
     * 
     * @return Filters the returned results to only those for the specified AWS service. If not specified, then AWS
     *         returns service-specific credentials for all services.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns
     * service-specific credentials for all services.
     * </p>
     * 
     * @param serviceName
     *        Filters the returned results to only those for the specified AWS service. If not specified, then AWS
     *        returns service-specific credentials for all services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceSpecificCredentialsRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceSpecificCredentialsRequest == false)
            return false;
        ListServiceSpecificCredentialsRequest other = (ListServiceSpecificCredentialsRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceSpecificCredentialsRequest clone() {
        return (ListServiceSpecificCredentialsRequest) super.clone();
    }

}
