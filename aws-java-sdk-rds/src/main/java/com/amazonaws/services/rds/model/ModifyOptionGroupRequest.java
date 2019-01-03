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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyOptionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyOptionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * Options in this list are added to the option group or, if already present, the specified configuration is used to
     * update the existing configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionConfiguration> optionsToInclude;
    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> optionsToRemove;
    /**
     * <p>
     * Indicates whether the changes should be applied immediately, or during the next maintenance window for each
     * instance associated with the option group.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to be modified.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *        instance
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @return The name of the option group to be modified.</p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *         option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *         instance
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be modified.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to be modified.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *        instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyOptionGroupRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already present, the specified configuration is used to
     * update the existing configuration.
     * </p>
     * 
     * @return Options in this list are added to the option group or, if already present, the specified configuration is
     *         used to update the existing configuration.
     */

    public java.util.List<OptionConfiguration> getOptionsToInclude() {
        if (optionsToInclude == null) {
            optionsToInclude = new com.amazonaws.internal.SdkInternalList<OptionConfiguration>();
        }
        return optionsToInclude;
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already present, the specified configuration is used to
     * update the existing configuration.
     * </p>
     * 
     * @param optionsToInclude
     *        Options in this list are added to the option group or, if already present, the specified configuration is
     *        used to update the existing configuration.
     */

    public void setOptionsToInclude(java.util.Collection<OptionConfiguration> optionsToInclude) {
        if (optionsToInclude == null) {
            this.optionsToInclude = null;
            return;
        }

        this.optionsToInclude = new com.amazonaws.internal.SdkInternalList<OptionConfiguration>(optionsToInclude);
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already present, the specified configuration is used to
     * update the existing configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionsToInclude(java.util.Collection)} or {@link #withOptionsToInclude(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optionsToInclude
     *        Options in this list are added to the option group or, if already present, the specified configuration is
     *        used to update the existing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyOptionGroupRequest withOptionsToInclude(OptionConfiguration... optionsToInclude) {
        if (this.optionsToInclude == null) {
            setOptionsToInclude(new com.amazonaws.internal.SdkInternalList<OptionConfiguration>(optionsToInclude.length));
        }
        for (OptionConfiguration ele : optionsToInclude) {
            this.optionsToInclude.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Options in this list are added to the option group or, if already present, the specified configuration is used to
     * update the existing configuration.
     * </p>
     * 
     * @param optionsToInclude
     *        Options in this list are added to the option group or, if already present, the specified configuration is
     *        used to update the existing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyOptionGroupRequest withOptionsToInclude(java.util.Collection<OptionConfiguration> optionsToInclude) {
        setOptionsToInclude(optionsToInclude);
        return this;
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     * 
     * @return Options in this list are removed from the option group.
     */

    public java.util.List<String> getOptionsToRemove() {
        if (optionsToRemove == null) {
            optionsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return optionsToRemove;
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     * 
     * @param optionsToRemove
     *        Options in this list are removed from the option group.
     */

    public void setOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }

        this.optionsToRemove = new com.amazonaws.internal.SdkInternalList<String>(optionsToRemove);
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionsToRemove(java.util.Collection)} or {@link #withOptionsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optionsToRemove
     *        Options in this list are removed from the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyOptionGroupRequest withOptionsToRemove(String... optionsToRemove) {
        if (this.optionsToRemove == null) {
            setOptionsToRemove(new com.amazonaws.internal.SdkInternalList<String>(optionsToRemove.length));
        }
        for (String ele : optionsToRemove) {
            this.optionsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Options in this list are removed from the option group.
     * </p>
     * 
     * @param optionsToRemove
     *        Options in this list are removed from the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyOptionGroupRequest withOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        setOptionsToRemove(optionsToRemove);
        return this;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately, or during the next maintenance window for each
     * instance associated with the option group.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates whether the changes should be applied immediately, or during the next maintenance window for
     *        each instance associated with the option group.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately, or during the next maintenance window for each
     * instance associated with the option group.
     * </p>
     * 
     * @return Indicates whether the changes should be applied immediately, or during the next maintenance window for
     *         each instance associated with the option group.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately, or during the next maintenance window for each
     * instance associated with the option group.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates whether the changes should be applied immediately, or during the next maintenance window for
     *        each instance associated with the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyOptionGroupRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately, or during the next maintenance window for each
     * instance associated with the option group.
     * </p>
     * 
     * @return Indicates whether the changes should be applied immediately, or during the next maintenance window for
     *         each instance associated with the option group.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getOptionsToInclude() != null)
            sb.append("OptionsToInclude: ").append(getOptionsToInclude()).append(",");
        if (getOptionsToRemove() != null)
            sb.append("OptionsToRemove: ").append(getOptionsToRemove()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyOptionGroupRequest == false)
            return false;
        ModifyOptionGroupRequest other = (ModifyOptionGroupRequest) obj;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getOptionsToInclude() == null ^ this.getOptionsToInclude() == null)
            return false;
        if (other.getOptionsToInclude() != null && other.getOptionsToInclude().equals(this.getOptionsToInclude()) == false)
            return false;
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null)
            return false;
        if (other.getOptionsToRemove() != null && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getOptionsToInclude() == null) ? 0 : getOptionsToInclude().hashCode());
        hashCode = prime * hashCode + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public ModifyOptionGroupRequest clone() {
        return (ModifyOptionGroupRequest) super.clone();
    }

}
