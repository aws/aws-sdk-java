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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The description of the .
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the updated name for the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     */
    private UpdateApplicationPortalOptions portalOptions;
    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application. For more information about ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     *        Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return Specifies the ARN of the application. For more information about ARNs, see <a
     *         href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     *         Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application. For more information about ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     *        Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The description of the .
     * </p>
     * 
     * @param description
     *        The description of the .
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the .
     * </p>
     * 
     * @return The description of the .
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the .
     * </p>
     * 
     * @param description
     *        The description of the .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the updated name for the application.
     * </p>
     * 
     * @param name
     *        Specifies the updated name for the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the updated name for the application.
     * </p>
     * 
     * @return Specifies the updated name for the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the updated name for the application.
     * </p>
     * 
     * @param name
     *        Specifies the updated name for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     * 
     * @param portalOptions
     *        A structure that describes the options for the portal associated with an application.
     */

    public void setPortalOptions(UpdateApplicationPortalOptions portalOptions) {
        this.portalOptions = portalOptions;
    }

    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     * 
     * @return A structure that describes the options for the portal associated with an application.
     */

    public UpdateApplicationPortalOptions getPortalOptions() {
        return this.portalOptions;
    }

    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     * 
     * @param portalOptions
     *        A structure that describes the options for the portal associated with an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withPortalOptions(UpdateApplicationPortalOptions portalOptions) {
        setPortalOptions(portalOptions);
        return this;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the application is enabled or disabled.
     * @see ApplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @return Specifies whether the application is enabled or disabled.
     * @see ApplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the application is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public UpdateApplicationRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the application is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public UpdateApplicationRequest withStatus(ApplicationStatus status) {
        this.status = status.toString();
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPortalOptions() != null)
            sb.append("PortalOptions: ").append(getPortalOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPortalOptions() == null ^ this.getPortalOptions() == null)
            return false;
        if (other.getPortalOptions() != null && other.getPortalOptions().equals(this.getPortalOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPortalOptions() == null) ? 0 : getPortalOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
