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

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/OptionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionGroup implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     */
    private String optionGroupDescription;
    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied to.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     */
    private String majorEngineVersion;
    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Option> options;
    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value <code>true</code>
     * indicates the option group can be applied to both VPC and non-VPC instances.
     * </p>
     */
    private Boolean allowsVpcAndNonVpcInstanceMemberships;
    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>, this field is blank. If
     * <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code> and this field is blank, then this option group
     * can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only
     * be applied to instances that are in the VPC indicated by this field.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     */
    private String optionGroupArn;

    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     * 
     * @param optionGroupName
     *        Specifies the name of the option group.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     * 
     * @return Specifies the name of the option group.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the option group.
     * </p>
     * 
     * @param optionGroupName
     *        Specifies the name of the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     * 
     * @param optionGroupDescription
     *        Provides a description of the option group.
     */

    public void setOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
    }

    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     * 
     * @return Provides a description of the option group.
     */

    public String getOptionGroupDescription() {
        return this.optionGroupDescription;
    }

    /**
     * <p>
     * Provides a description of the option group.
     * </p>
     * 
     * @param optionGroupDescription
     *        Provides a description of the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withOptionGroupDescription(String optionGroupDescription) {
        setOptionGroupDescription(optionGroupDescription);
        return this;
    }

    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied to.
     * </p>
     * 
     * @param engineName
     *        Indicates the name of the engine that this option group can be applied to.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied to.
     * </p>
     * 
     * @return Indicates the name of the engine that this option group can be applied to.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * Indicates the name of the engine that this option group can be applied to.
     * </p>
     * 
     * @param engineName
     *        Indicates the name of the engine that this option group can be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     * 
     * @param majorEngineVersion
     *        Indicates the major engine version associated with this option group.
     */

    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     * 
     * @return Indicates the major engine version associated with this option group.
     */

    public String getMajorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version associated with this option group.
     * </p>
     * 
     * @param majorEngineVersion
     *        Indicates the major engine version associated with this option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withMajorEngineVersion(String majorEngineVersion) {
        setMajorEngineVersion(majorEngineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     * 
     * @return Indicates what options are available in the option group.
     */

    public java.util.List<Option> getOptions() {
        if (options == null) {
            options = new com.amazonaws.internal.SdkInternalList<Option>();
        }
        return options;
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     * 
     * @param options
     *        Indicates what options are available in the option group.
     */

    public void setOptions(java.util.Collection<Option> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new com.amazonaws.internal.SdkInternalList<Option>(options);
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        Indicates what options are available in the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withOptions(Option... options) {
        if (this.options == null) {
            setOptions(new com.amazonaws.internal.SdkInternalList<Option>(options.length));
        }
        for (Option ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates what options are available in the option group.
     * </p>
     * 
     * @param options
     *        Indicates what options are available in the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withOptions(java.util.Collection<Option> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value <code>true</code>
     * indicates the option group can be applied to both VPC and non-VPC instances.
     * </p>
     * 
     * @param allowsVpcAndNonVpcInstanceMemberships
     *        Indicates whether this option group can be applied to both VPC and non-VPC instances. The value
     *        <code>true</code> indicates the option group can be applied to both VPC and non-VPC instances.
     */

    public void setAllowsVpcAndNonVpcInstanceMemberships(Boolean allowsVpcAndNonVpcInstanceMemberships) {
        this.allowsVpcAndNonVpcInstanceMemberships = allowsVpcAndNonVpcInstanceMemberships;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value <code>true</code>
     * indicates the option group can be applied to both VPC and non-VPC instances.
     * </p>
     * 
     * @return Indicates whether this option group can be applied to both VPC and non-VPC instances. The value
     *         <code>true</code> indicates the option group can be applied to both VPC and non-VPC instances.
     */

    public Boolean getAllowsVpcAndNonVpcInstanceMemberships() {
        return this.allowsVpcAndNonVpcInstanceMemberships;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value <code>true</code>
     * indicates the option group can be applied to both VPC and non-VPC instances.
     * </p>
     * 
     * @param allowsVpcAndNonVpcInstanceMemberships
     *        Indicates whether this option group can be applied to both VPC and non-VPC instances. The value
     *        <code>true</code> indicates the option group can be applied to both VPC and non-VPC instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withAllowsVpcAndNonVpcInstanceMemberships(Boolean allowsVpcAndNonVpcInstanceMemberships) {
        setAllowsVpcAndNonVpcInstanceMemberships(allowsVpcAndNonVpcInstanceMemberships);
        return this;
    }

    /**
     * <p>
     * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value <code>true</code>
     * indicates the option group can be applied to both VPC and non-VPC instances.
     * </p>
     * 
     * @return Indicates whether this option group can be applied to both VPC and non-VPC instances. The value
     *         <code>true</code> indicates the option group can be applied to both VPC and non-VPC instances.
     */

    public Boolean isAllowsVpcAndNonVpcInstanceMemberships() {
        return this.allowsVpcAndNonVpcInstanceMemberships;
    }

    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>, this field is blank. If
     * <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code> and this field is blank, then this option group
     * can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only
     * be applied to instances that are in the VPC indicated by this field.
     * </p>
     * 
     * @param vpcId
     *        If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>, this field is blank. If
     *        <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code> and this field is blank, then this
     *        option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this
     *        option group can only be applied to instances that are in the VPC indicated by this field.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>, this field is blank. If
     * <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code> and this field is blank, then this option group
     * can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only
     * be applied to instances that are in the VPC indicated by this field.
     * </p>
     * 
     * @return If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>, this field is blank. If
     *         <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code> and this field is blank, then this
     *         option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this
     *         option group can only be applied to instances that are in the VPC indicated by this field.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>, this field is blank. If
     * <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code> and this field is blank, then this option group
     * can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only
     * be applied to instances that are in the VPC indicated by this field.
     * </p>
     * 
     * @param vpcId
     *        If <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>false</code>, this field is blank. If
     *        <b>AllowsVpcAndNonVpcInstanceMemberships</b> is <code>true</code> and this field is blank, then this
     *        option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this
     *        option group can only be applied to instances that are in the VPC indicated by this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     * 
     * @param optionGroupArn
     *        The Amazon Resource Name (ARN) for the option group.
     */

    public void setOptionGroupArn(String optionGroupArn) {
        this.optionGroupArn = optionGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the option group.
     */

    public String getOptionGroupArn() {
        return this.optionGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the option group.
     * </p>
     * 
     * @param optionGroupArn
     *        The Amazon Resource Name (ARN) for the option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroup withOptionGroupArn(String optionGroupArn) {
        setOptionGroupArn(optionGroupArn);
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getOptionGroupDescription() != null)
            sb.append("OptionGroupDescription: ").append(getOptionGroupDescription()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: ").append(getMajorEngineVersion()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getAllowsVpcAndNonVpcInstanceMemberships() != null)
            sb.append("AllowsVpcAndNonVpcInstanceMemberships: ").append(getAllowsVpcAndNonVpcInstanceMemberships()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getOptionGroupArn() != null)
            sb.append("OptionGroupArn: ").append(getOptionGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroup == false)
            return false;
        OptionGroup other = (OptionGroup) obj;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getOptionGroupDescription() == null ^ this.getOptionGroupDescription() == null)
            return false;
        if (other.getOptionGroupDescription() != null && other.getOptionGroupDescription().equals(this.getOptionGroupDescription()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getAllowsVpcAndNonVpcInstanceMemberships() == null ^ this.getAllowsVpcAndNonVpcInstanceMemberships() == null)
            return false;
        if (other.getAllowsVpcAndNonVpcInstanceMemberships() != null
                && other.getAllowsVpcAndNonVpcInstanceMemberships().equals(this.getAllowsVpcAndNonVpcInstanceMemberships()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOptionGroupArn() == null ^ this.getOptionGroupArn() == null)
            return false;
        if (other.getOptionGroupArn() != null && other.getOptionGroupArn().equals(this.getOptionGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupDescription() == null) ? 0 : getOptionGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getAllowsVpcAndNonVpcInstanceMemberships() == null) ? 0 : getAllowsVpcAndNonVpcInstanceMemberships().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupArn() == null) ? 0 : getOptionGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public OptionGroup clone() {
        try {
            return (OptionGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
