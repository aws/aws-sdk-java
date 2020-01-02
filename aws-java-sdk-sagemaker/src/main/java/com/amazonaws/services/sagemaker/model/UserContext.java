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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the user who created or modified an experiment, trial, or trial component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UserContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     */
    private String userProfileArn;
    /**
     * <p>
     * The name of the user's profile.
     * </p>
     */
    private String userProfileName;
    /**
     * <p>
     * The domain associated with the user.
     * </p>
     */
    private String domainId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     * 
     * @param userProfileArn
     *        The Amazon Resource Name (ARN) of the user's profile.
     */

    public void setUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user's profile.
     */

    public String getUserProfileArn() {
        return this.userProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     * 
     * @param userProfileArn
     *        The Amazon Resource Name (ARN) of the user's profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withUserProfileArn(String userProfileArn) {
        setUserProfileArn(userProfileArn);
        return this;
    }

    /**
     * <p>
     * The name of the user's profile.
     * </p>
     * 
     * @param userProfileName
     *        The name of the user's profile.
     */

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The name of the user's profile.
     * </p>
     * 
     * @return The name of the user's profile.
     */

    public String getUserProfileName() {
        return this.userProfileName;
    }

    /**
     * <p>
     * The name of the user's profile.
     * </p>
     * 
     * @param userProfileName
     *        The name of the user's profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withUserProfileName(String userProfileName) {
        setUserProfileName(userProfileName);
        return this;
    }

    /**
     * <p>
     * The domain associated with the user.
     * </p>
     * 
     * @param domainId
     *        The domain associated with the user.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain associated with the user.
     * </p>
     * 
     * @return The domain associated with the user.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The domain associated with the user.
     * </p>
     * 
     * @param domainId
     *        The domain associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withDomainId(String domainId) {
        setDomainId(domainId);
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
        if (getUserProfileArn() != null)
            sb.append("UserProfileArn: ").append(getUserProfileArn()).append(",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: ").append(getUserProfileName()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserContext == false)
            return false;
        UserContext other = (UserContext) obj;
        if (other.getUserProfileArn() == null ^ this.getUserProfileArn() == null)
            return false;
        if (other.getUserProfileArn() != null && other.getUserProfileArn().equals(this.getUserProfileArn()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserProfileArn() == null) ? 0 : getUserProfileArn().hashCode());
        hashCode = prime * hashCode + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        return hashCode;
    }

    @Override
    public UserContext clone() {
        try {
            return (UserContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.UserContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
