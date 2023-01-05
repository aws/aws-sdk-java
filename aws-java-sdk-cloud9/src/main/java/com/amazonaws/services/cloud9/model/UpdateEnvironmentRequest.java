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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the environment to change settings.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A replacement name for the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Any new or replacement description for the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials for an
     * Cloud9 environment by using one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only the environment owner can change the status of managed temporary credentials. An
     * <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary credentials
     * is made by an account that's not the environment owner.
     * </p>
     * </note>
     */
    private String managedCredentialsAction;

    /**
     * <p>
     * The ID of the environment to change settings.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to change settings.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment to change settings.
     * </p>
     * 
     * @return The ID of the environment to change settings.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment to change settings.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to change settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A replacement name for the environment.
     * </p>
     * 
     * @param name
     *        A replacement name for the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A replacement name for the environment.
     * </p>
     * 
     * @return A replacement name for the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A replacement name for the environment.
     * </p>
     * 
     * @param name
     *        A replacement name for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Any new or replacement description for the environment.
     * </p>
     * 
     * @param description
     *        Any new or replacement description for the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Any new or replacement description for the environment.
     * </p>
     * 
     * @return Any new or replacement description for the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Any new or replacement description for the environment.
     * </p>
     * 
     * @param description
     *        Any new or replacement description for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials for an
     * Cloud9 environment by using one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only the environment owner can change the status of managed temporary credentials. An
     * <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary credentials
     * is made by an account that's not the environment owner.
     * </p>
     * </note>
     * 
     * @param managedCredentialsAction
     *        Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials
     *        for an Cloud9 environment by using one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only the environment owner can change the status of managed temporary credentials. An
     *        <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary
     *        credentials is made by an account that's not the environment owner.
     *        </p>
     * @see ManagedCredentialsAction
     */

    public void setManagedCredentialsAction(String managedCredentialsAction) {
        this.managedCredentialsAction = managedCredentialsAction;
    }

    /**
     * <p>
     * Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials for an
     * Cloud9 environment by using one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only the environment owner can change the status of managed temporary credentials. An
     * <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary credentials
     * is made by an account that's not the environment owner.
     * </p>
     * </note>
     * 
     * @return Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials
     *         for an Cloud9 environment by using one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLE</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Only the environment owner can change the status of managed temporary credentials. An
     *         <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary
     *         credentials is made by an account that's not the environment owner.
     *         </p>
     * @see ManagedCredentialsAction
     */

    public String getManagedCredentialsAction() {
        return this.managedCredentialsAction;
    }

    /**
     * <p>
     * Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials for an
     * Cloud9 environment by using one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only the environment owner can change the status of managed temporary credentials. An
     * <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary credentials
     * is made by an account that's not the environment owner.
     * </p>
     * </note>
     * 
     * @param managedCredentialsAction
     *        Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials
     *        for an Cloud9 environment by using one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only the environment owner can change the status of managed temporary credentials. An
     *        <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary
     *        credentials is made by an account that's not the environment owner.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedCredentialsAction
     */

    public UpdateEnvironmentRequest withManagedCredentialsAction(String managedCredentialsAction) {
        setManagedCredentialsAction(managedCredentialsAction);
        return this;
    }

    /**
     * <p>
     * Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials for an
     * Cloud9 environment by using one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only the environment owner can change the status of managed temporary credentials. An
     * <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary credentials
     * is made by an account that's not the environment owner.
     * </p>
     * </note>
     * 
     * @param managedCredentialsAction
     *        Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials
     *        for an Cloud9 environment by using one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only the environment owner can change the status of managed temporary credentials. An
     *        <code>AccessDeniedException</code> is thrown if an attempt to turn on or turn off managed temporary
     *        credentials is made by an account that's not the environment owner.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedCredentialsAction
     */

    public UpdateEnvironmentRequest withManagedCredentialsAction(ManagedCredentialsAction managedCredentialsAction) {
        this.managedCredentialsAction = managedCredentialsAction.toString();
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getManagedCredentialsAction() != null)
            sb.append("ManagedCredentialsAction: ").append(getManagedCredentialsAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getManagedCredentialsAction() == null ^ this.getManagedCredentialsAction() == null)
            return false;
        if (other.getManagedCredentialsAction() != null && other.getManagedCredentialsAction().equals(this.getManagedCredentialsAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getManagedCredentialsAction() == null) ? 0 : getManagedCredentialsAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}
