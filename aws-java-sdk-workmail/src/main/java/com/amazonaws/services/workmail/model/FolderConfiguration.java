/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration applied to an organization's folders by its retention policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/FolderConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FolderConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The folder name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The action to take on the folder contents at the end of the folder configuration period.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     */
    private Integer period;

    /**
     * <p>
     * The folder name.
     * </p>
     * 
     * @param name
     *        The folder name.
     * @see FolderName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The folder name.
     * </p>
     * 
     * @return The folder name.
     * @see FolderName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The folder name.
     * </p>
     * 
     * @param name
     *        The folder name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderName
     */

    public FolderConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The folder name.
     * </p>
     * 
     * @param name
     *        The folder name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderName
     */

    public FolderConfiguration withName(FolderName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder configuration period.
     * </p>
     * 
     * @param action
     *        The action to take on the folder contents at the end of the folder configuration period.
     * @see RetentionAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder configuration period.
     * </p>
     * 
     * @return The action to take on the folder contents at the end of the folder configuration period.
     * @see RetentionAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder configuration period.
     * </p>
     * 
     * @param action
     *        The action to take on the folder contents at the end of the folder configuration period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionAction
     */

    public FolderConfiguration withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder configuration period.
     * </p>
     * 
     * @param action
     *        The action to take on the folder contents at the end of the folder configuration period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionAction
     */

    public FolderConfiguration withAction(RetentionAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     * 
     * @param period
     *        The period of time at which the folder configuration action is applied.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     * 
     * @return The period of time at which the folder configuration action is applied.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     * 
     * @param period
     *        The period of time at which the folder configuration action is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderConfiguration withPeriod(Integer period) {
        setPeriod(period);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FolderConfiguration == false)
            return false;
        FolderConfiguration other = (FolderConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        return hashCode;
    }

    @Override
    public FolderConfiguration clone() {
        try {
            return (FolderConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.FolderConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
