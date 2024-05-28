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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates a blocked phrases configuration in your Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BlockedPhrasesConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockedPhrasesConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     */
    private java.util.List<String> blockedPhrasesToCreateOrUpdate;
    /**
     * <p>
     * Deletes a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     */
    private java.util.List<String> blockedPhrasesToDelete;
    /**
     * <p>
     * The configured custom message displayed to your end user when they use blocked phrase during chat.
     * </p>
     */
    private String systemMessageOverride;

    /**
     * <p>
     * Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * 
     * @return Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     */

    public java.util.List<String> getBlockedPhrasesToCreateOrUpdate() {
        return blockedPhrasesToCreateOrUpdate;
    }

    /**
     * <p>
     * Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * 
     * @param blockedPhrasesToCreateOrUpdate
     *        Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     */

    public void setBlockedPhrasesToCreateOrUpdate(java.util.Collection<String> blockedPhrasesToCreateOrUpdate) {
        if (blockedPhrasesToCreateOrUpdate == null) {
            this.blockedPhrasesToCreateOrUpdate = null;
            return;
        }

        this.blockedPhrasesToCreateOrUpdate = new java.util.ArrayList<String>(blockedPhrasesToCreateOrUpdate);
    }

    /**
     * <p>
     * Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedPhrasesToCreateOrUpdate(java.util.Collection)} or
     * {@link #withBlockedPhrasesToCreateOrUpdate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param blockedPhrasesToCreateOrUpdate
     *        Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfigurationUpdate withBlockedPhrasesToCreateOrUpdate(String... blockedPhrasesToCreateOrUpdate) {
        if (this.blockedPhrasesToCreateOrUpdate == null) {
            setBlockedPhrasesToCreateOrUpdate(new java.util.ArrayList<String>(blockedPhrasesToCreateOrUpdate.length));
        }
        for (String ele : blockedPhrasesToCreateOrUpdate) {
            this.blockedPhrasesToCreateOrUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * 
     * @param blockedPhrasesToCreateOrUpdate
     *        Creates or updates a blocked phrases configuration in your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfigurationUpdate withBlockedPhrasesToCreateOrUpdate(java.util.Collection<String> blockedPhrasesToCreateOrUpdate) {
        setBlockedPhrasesToCreateOrUpdate(blockedPhrasesToCreateOrUpdate);
        return this;
    }

    /**
     * <p>
     * Deletes a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * 
     * @return Deletes a blocked phrases configuration in your Amazon Q Business application.
     */

    public java.util.List<String> getBlockedPhrasesToDelete() {
        return blockedPhrasesToDelete;
    }

    /**
     * <p>
     * Deletes a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * 
     * @param blockedPhrasesToDelete
     *        Deletes a blocked phrases configuration in your Amazon Q Business application.
     */

    public void setBlockedPhrasesToDelete(java.util.Collection<String> blockedPhrasesToDelete) {
        if (blockedPhrasesToDelete == null) {
            this.blockedPhrasesToDelete = null;
            return;
        }

        this.blockedPhrasesToDelete = new java.util.ArrayList<String>(blockedPhrasesToDelete);
    }

    /**
     * <p>
     * Deletes a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedPhrasesToDelete(java.util.Collection)} or
     * {@link #withBlockedPhrasesToDelete(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param blockedPhrasesToDelete
     *        Deletes a blocked phrases configuration in your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfigurationUpdate withBlockedPhrasesToDelete(String... blockedPhrasesToDelete) {
        if (this.blockedPhrasesToDelete == null) {
            setBlockedPhrasesToDelete(new java.util.ArrayList<String>(blockedPhrasesToDelete.length));
        }
        for (String ele : blockedPhrasesToDelete) {
            this.blockedPhrasesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Deletes a blocked phrases configuration in your Amazon Q Business application.
     * </p>
     * 
     * @param blockedPhrasesToDelete
     *        Deletes a blocked phrases configuration in your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfigurationUpdate withBlockedPhrasesToDelete(java.util.Collection<String> blockedPhrasesToDelete) {
        setBlockedPhrasesToDelete(blockedPhrasesToDelete);
        return this;
    }

    /**
     * <p>
     * The configured custom message displayed to your end user when they use blocked phrase during chat.
     * </p>
     * 
     * @param systemMessageOverride
     *        The configured custom message displayed to your end user when they use blocked phrase during chat.
     */

    public void setSystemMessageOverride(String systemMessageOverride) {
        this.systemMessageOverride = systemMessageOverride;
    }

    /**
     * <p>
     * The configured custom message displayed to your end user when they use blocked phrase during chat.
     * </p>
     * 
     * @return The configured custom message displayed to your end user when they use blocked phrase during chat.
     */

    public String getSystemMessageOverride() {
        return this.systemMessageOverride;
    }

    /**
     * <p>
     * The configured custom message displayed to your end user when they use blocked phrase during chat.
     * </p>
     * 
     * @param systemMessageOverride
     *        The configured custom message displayed to your end user when they use blocked phrase during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfigurationUpdate withSystemMessageOverride(String systemMessageOverride) {
        setSystemMessageOverride(systemMessageOverride);
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
        if (getBlockedPhrasesToCreateOrUpdate() != null)
            sb.append("BlockedPhrasesToCreateOrUpdate: ").append(getBlockedPhrasesToCreateOrUpdate()).append(",");
        if (getBlockedPhrasesToDelete() != null)
            sb.append("BlockedPhrasesToDelete: ").append(getBlockedPhrasesToDelete()).append(",");
        if (getSystemMessageOverride() != null)
            sb.append("SystemMessageOverride: ").append(getSystemMessageOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockedPhrasesConfigurationUpdate == false)
            return false;
        BlockedPhrasesConfigurationUpdate other = (BlockedPhrasesConfigurationUpdate) obj;
        if (other.getBlockedPhrasesToCreateOrUpdate() == null ^ this.getBlockedPhrasesToCreateOrUpdate() == null)
            return false;
        if (other.getBlockedPhrasesToCreateOrUpdate() != null
                && other.getBlockedPhrasesToCreateOrUpdate().equals(this.getBlockedPhrasesToCreateOrUpdate()) == false)
            return false;
        if (other.getBlockedPhrasesToDelete() == null ^ this.getBlockedPhrasesToDelete() == null)
            return false;
        if (other.getBlockedPhrasesToDelete() != null && other.getBlockedPhrasesToDelete().equals(this.getBlockedPhrasesToDelete()) == false)
            return false;
        if (other.getSystemMessageOverride() == null ^ this.getSystemMessageOverride() == null)
            return false;
        if (other.getSystemMessageOverride() != null && other.getSystemMessageOverride().equals(this.getSystemMessageOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockedPhrasesToCreateOrUpdate() == null) ? 0 : getBlockedPhrasesToCreateOrUpdate().hashCode());
        hashCode = prime * hashCode + ((getBlockedPhrasesToDelete() == null) ? 0 : getBlockedPhrasesToDelete().hashCode());
        hashCode = prime * hashCode + ((getSystemMessageOverride() == null) ? 0 : getSystemMessageOverride().hashCode());
        return hashCode;
    }

    @Override
    public BlockedPhrasesConfigurationUpdate clone() {
        try {
            return (BlockedPhrasesConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.BlockedPhrasesConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
