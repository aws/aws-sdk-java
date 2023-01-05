/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     */
    private String userSettingsArn;

    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     * 
     * @param userSettingsArn
     *        The ARN of the user settings.
     */

    public void setUserSettingsArn(String userSettingsArn) {
        this.userSettingsArn = userSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     * 
     * @return The ARN of the user settings.
     */

    public String getUserSettingsArn() {
        return this.userSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user settings.
     * </p>
     * 
     * @param userSettingsArn
     *        The ARN of the user settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserSettingsResult withUserSettingsArn(String userSettingsArn) {
        setUserSettingsArn(userSettingsArn);
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
        if (getUserSettingsArn() != null)
            sb.append("UserSettingsArn: ").append(getUserSettingsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserSettingsResult == false)
            return false;
        CreateUserSettingsResult other = (CreateUserSettingsResult) obj;
        if (other.getUserSettingsArn() == null ^ this.getUserSettingsArn() == null)
            return false;
        if (other.getUserSettingsArn() != null && other.getUserSettingsArn().equals(this.getUserSettingsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserSettingsArn() == null) ? 0 : getUserSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserSettingsResult clone() {
        try {
            return (CreateUserSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
