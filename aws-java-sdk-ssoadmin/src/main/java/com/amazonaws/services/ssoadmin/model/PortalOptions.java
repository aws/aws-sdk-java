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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes the options for the access portal associated with an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PortalOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortalOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that describes the sign-in options for the access portal.
     * </p>
     */
    private SignInOptions signInOptions;
    /**
     * <p>
     * Indicates whether this application is visible in the access portal.
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * A structure that describes the sign-in options for the access portal.
     * </p>
     * 
     * @param signInOptions
     *        A structure that describes the sign-in options for the access portal.
     */

    public void setSignInOptions(SignInOptions signInOptions) {
        this.signInOptions = signInOptions;
    }

    /**
     * <p>
     * A structure that describes the sign-in options for the access portal.
     * </p>
     * 
     * @return A structure that describes the sign-in options for the access portal.
     */

    public SignInOptions getSignInOptions() {
        return this.signInOptions;
    }

    /**
     * <p>
     * A structure that describes the sign-in options for the access portal.
     * </p>
     * 
     * @param signInOptions
     *        A structure that describes the sign-in options for the access portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalOptions withSignInOptions(SignInOptions signInOptions) {
        setSignInOptions(signInOptions);
        return this;
    }

    /**
     * <p>
     * Indicates whether this application is visible in the access portal.
     * </p>
     * 
     * @param visibility
     *        Indicates whether this application is visible in the access portal.
     * @see ApplicationVisibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * Indicates whether this application is visible in the access portal.
     * </p>
     * 
     * @return Indicates whether this application is visible in the access portal.
     * @see ApplicationVisibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * Indicates whether this application is visible in the access portal.
     * </p>
     * 
     * @param visibility
     *        Indicates whether this application is visible in the access portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVisibility
     */

    public PortalOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * Indicates whether this application is visible in the access portal.
     * </p>
     * 
     * @param visibility
     *        Indicates whether this application is visible in the access portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVisibility
     */

    public PortalOptions withVisibility(ApplicationVisibility visibility) {
        this.visibility = visibility.toString();
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
        if (getSignInOptions() != null)
            sb.append("SignInOptions: ").append(getSignInOptions()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortalOptions == false)
            return false;
        PortalOptions other = (PortalOptions) obj;
        if (other.getSignInOptions() == null ^ this.getSignInOptions() == null)
            return false;
        if (other.getSignInOptions() != null && other.getSignInOptions().equals(this.getSignInOptions()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignInOptions() == null) ? 0 : getSignInOptions().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public PortalOptions clone() {
        try {
            return (PortalOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.PortalOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
