/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An Input Security Group
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSecurityGroup implements Serializable, Cloneable, StructuredPojo {

    /** Unique ARN of Input Security Group */
    private String arn;
    /** The Id of the Input Security Group */
    private String id;
    /** Whitelist rules and their sync status */
    private java.util.List<InputWhitelistRule> whitelistRules;

    /**
     * Unique ARN of Input Security Group
     * 
     * @param arn
     *        Unique ARN of Input Security Group
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Unique ARN of Input Security Group
     * 
     * @return Unique ARN of Input Security Group
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Unique ARN of Input Security Group
     * 
     * @param arn
     *        Unique ARN of Input Security Group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSecurityGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The Id of the Input Security Group
     * 
     * @param id
     *        The Id of the Input Security Group
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Id of the Input Security Group
     * 
     * @return The Id of the Input Security Group
     */

    public String getId() {
        return this.id;
    }

    /**
     * The Id of the Input Security Group
     * 
     * @param id
     *        The Id of the Input Security Group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSecurityGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Whitelist rules and their sync status
     * 
     * @return Whitelist rules and their sync status
     */

    public java.util.List<InputWhitelistRule> getWhitelistRules() {
        return whitelistRules;
    }

    /**
     * Whitelist rules and their sync status
     * 
     * @param whitelistRules
     *        Whitelist rules and their sync status
     */

    public void setWhitelistRules(java.util.Collection<InputWhitelistRule> whitelistRules) {
        if (whitelistRules == null) {
            this.whitelistRules = null;
            return;
        }

        this.whitelistRules = new java.util.ArrayList<InputWhitelistRule>(whitelistRules);
    }

    /**
     * Whitelist rules and their sync status
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhitelistRules(java.util.Collection)} or {@link #withWhitelistRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param whitelistRules
     *        Whitelist rules and their sync status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSecurityGroup withWhitelistRules(InputWhitelistRule... whitelistRules) {
        if (this.whitelistRules == null) {
            setWhitelistRules(new java.util.ArrayList<InputWhitelistRule>(whitelistRules.length));
        }
        for (InputWhitelistRule ele : whitelistRules) {
            this.whitelistRules.add(ele);
        }
        return this;
    }

    /**
     * Whitelist rules and their sync status
     * 
     * @param whitelistRules
     *        Whitelist rules and their sync status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSecurityGroup withWhitelistRules(java.util.Collection<InputWhitelistRule> whitelistRules) {
        setWhitelistRules(whitelistRules);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getWhitelistRules() != null)
            sb.append("WhitelistRules: ").append(getWhitelistRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSecurityGroup == false)
            return false;
        InputSecurityGroup other = (InputSecurityGroup) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getWhitelistRules() == null ^ this.getWhitelistRules() == null)
            return false;
        if (other.getWhitelistRules() != null && other.getWhitelistRules().equals(this.getWhitelistRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getWhitelistRules() == null) ? 0 : getWhitelistRules().hashCode());
        return hashCode;
    }

    @Override
    public InputSecurityGroup clone() {
        try {
            return (InputSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputSecurityGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
