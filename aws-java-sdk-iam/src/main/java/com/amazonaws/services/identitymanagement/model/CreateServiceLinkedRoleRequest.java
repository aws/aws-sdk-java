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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateServiceLinkedRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceLinkedRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The service principal for the AWS service to which this role is attached. You use a string similar to a URL but
     * without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact service principal for your service-linked
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS
     * Services That Work with IAM</a> in the <i>IAM User Guide</i> and look for the services that have <b>Yes </b>in
     * the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the service-linked role documentation
     * for that service.
     * </p>
     */
    private String aWSServiceName;
    /**
     * <p>
     * The description of the role.
     * </p>
     */
    private String description;
    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided prefix to form the complete role name. If
     * you make multiple requests for the same service, then you must supply a different <code>CustomSuffix</code> for
     * each request. Otherwise the request fails with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix and the
     * operation fails, try the operation again without the suffix.
     * </p>
     */
    private String customSuffix;

    /**
     * <p>
     * The service principal for the AWS service to which this role is attached. You use a string similar to a URL but
     * without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact service principal for your service-linked
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS
     * Services That Work with IAM</a> in the <i>IAM User Guide</i> and look for the services that have <b>Yes </b>in
     * the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the service-linked role documentation
     * for that service.
     * </p>
     * 
     * @param aWSServiceName
     *        The service principal for the AWS service to which this role is attached. You use a string similar to a
     *        URL but without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>. </p>
     *        <p>
     *        Service principals are unique and case-sensitive. To find the exact service principal for your
     *        service-linked role, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS
     *        Services That Work with IAM</a> in the <i>IAM User Guide</i> and look for the services that have <b>Yes
     *        </b>in the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the service-linked role
     *        documentation for that service.
     */

    public void setAWSServiceName(String aWSServiceName) {
        this.aWSServiceName = aWSServiceName;
    }

    /**
     * <p>
     * The service principal for the AWS service to which this role is attached. You use a string similar to a URL but
     * without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact service principal for your service-linked
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS
     * Services That Work with IAM</a> in the <i>IAM User Guide</i> and look for the services that have <b>Yes </b>in
     * the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the service-linked role documentation
     * for that service.
     * </p>
     * 
     * @return The service principal for the AWS service to which this role is attached. You use a string similar to a
     *         URL but without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>. </p>
     *         <p>
     *         Service principals are unique and case-sensitive. To find the exact service principal for your
     *         service-linked role, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
     *         >AWS Services That Work with IAM</a> in the <i>IAM User Guide</i> and look for the services that have
     *         <b>Yes </b>in the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the
     *         service-linked role documentation for that service.
     */

    public String getAWSServiceName() {
        return this.aWSServiceName;
    }

    /**
     * <p>
     * The service principal for the AWS service to which this role is attached. You use a string similar to a URL but
     * without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>.
     * </p>
     * <p>
     * Service principals are unique and case-sensitive. To find the exact service principal for your service-linked
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS
     * Services That Work with IAM</a> in the <i>IAM User Guide</i> and look for the services that have <b>Yes </b>in
     * the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the service-linked role documentation
     * for that service.
     * </p>
     * 
     * @param aWSServiceName
     *        The service principal for the AWS service to which this role is attached. You use a string similar to a
     *        URL but without the http:// in front. For example: <code>elasticbeanstalk.amazonaws.com</code>. </p>
     *        <p>
     *        Service principals are unique and case-sensitive. To find the exact service principal for your
     *        service-linked role, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS
     *        Services That Work with IAM</a> in the <i>IAM User Guide</i> and look for the services that have <b>Yes
     *        </b>in the <b>Service-Linked Role</b> column. Choose the <b>Yes</b> link to view the service-linked role
     *        documentation for that service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLinkedRoleRequest withAWSServiceName(String aWSServiceName) {
        setAWSServiceName(aWSServiceName);
        return this;
    }

    /**
     * <p>
     * The description of the role.
     * </p>
     * 
     * @param description
     *        The description of the role.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the role.
     * </p>
     * 
     * @return The description of the role.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the role.
     * </p>
     * 
     * @param description
     *        The description of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLinkedRoleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided prefix to form the complete role name. If
     * you make multiple requests for the same service, then you must supply a different <code>CustomSuffix</code> for
     * each request. Otherwise the request fails with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix and the
     * operation fails, try the operation again without the suffix.
     * </p>
     * 
     * @param customSuffix
     *        <p>
     *        A string that you provide, which is combined with the service-provided prefix to form the complete role
     *        name. If you make multiple requests for the same service, then you must supply a different
     *        <code>CustomSuffix</code> for each request. Otherwise the request fails with a duplicate role name error.
     *        For example, you could add <code>-1</code> or <code>-debug</code> to the suffix.
     *        </p>
     *        <p>
     *        Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix
     *        and the operation fails, try the operation again without the suffix.
     */

    public void setCustomSuffix(String customSuffix) {
        this.customSuffix = customSuffix;
    }

    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided prefix to form the complete role name. If
     * you make multiple requests for the same service, then you must supply a different <code>CustomSuffix</code> for
     * each request. Otherwise the request fails with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix and the
     * operation fails, try the operation again without the suffix.
     * </p>
     * 
     * @return <p>
     *         A string that you provide, which is combined with the service-provided prefix to form the complete role
     *         name. If you make multiple requests for the same service, then you must supply a different
     *         <code>CustomSuffix</code> for each request. Otherwise the request fails with a duplicate role name error.
     *         For example, you could add <code>-1</code> or <code>-debug</code> to the suffix.
     *         </p>
     *         <p>
     *         Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix
     *         and the operation fails, try the operation again without the suffix.
     */

    public String getCustomSuffix() {
        return this.customSuffix;
    }

    /**
     * <p/>
     * <p>
     * A string that you provide, which is combined with the service-provided prefix to form the complete role name. If
     * you make multiple requests for the same service, then you must supply a different <code>CustomSuffix</code> for
     * each request. Otherwise the request fails with a duplicate role name error. For example, you could add
     * <code>-1</code> or <code>-debug</code> to the suffix.
     * </p>
     * <p>
     * Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix and the
     * operation fails, try the operation again without the suffix.
     * </p>
     * 
     * @param customSuffix
     *        <p>
     *        A string that you provide, which is combined with the service-provided prefix to form the complete role
     *        name. If you make multiple requests for the same service, then you must supply a different
     *        <code>CustomSuffix</code> for each request. Otherwise the request fails with a duplicate role name error.
     *        For example, you could add <code>-1</code> or <code>-debug</code> to the suffix.
     *        </p>
     *        <p>
     *        Some services do not support the <code>CustomSuffix</code> parameter. If you provide an optional suffix
     *        and the operation fails, try the operation again without the suffix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLinkedRoleRequest withCustomSuffix(String customSuffix) {
        setCustomSuffix(customSuffix);
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
        if (getAWSServiceName() != null)
            sb.append("AWSServiceName: ").append(getAWSServiceName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCustomSuffix() != null)
            sb.append("CustomSuffix: ").append(getCustomSuffix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceLinkedRoleRequest == false)
            return false;
        CreateServiceLinkedRoleRequest other = (CreateServiceLinkedRoleRequest) obj;
        if (other.getAWSServiceName() == null ^ this.getAWSServiceName() == null)
            return false;
        if (other.getAWSServiceName() != null && other.getAWSServiceName().equals(this.getAWSServiceName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCustomSuffix() == null ^ this.getCustomSuffix() == null)
            return false;
        if (other.getCustomSuffix() != null && other.getCustomSuffix().equals(this.getCustomSuffix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSServiceName() == null) ? 0 : getAWSServiceName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCustomSuffix() == null) ? 0 : getCustomSuffix().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceLinkedRoleRequest clone() {
        return (CreateServiceLinkedRoleRequest) super.clone();
    }

}
