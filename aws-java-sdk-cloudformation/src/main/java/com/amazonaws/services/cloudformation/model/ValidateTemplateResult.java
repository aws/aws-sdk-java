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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for <a>ValidateTemplate</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ValidateTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TemplateParameter> parameters;
    /**
     * <p>
     * The description found within the template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM resources, you must specify the
     * CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * The list of resources that generated the values in the <code>Capabilities</code> response element.
     * </p>
     */
    private String capabilitiesReason;
    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> declaredTransforms;

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     * 
     * @return A list of <code>TemplateParameter</code> structures.
     */

    public java.util.List<TemplateParameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<TemplateParameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     * 
     * @param parameters
     *        A list of <code>TemplateParameter</code> structures.
     */

    public void setParameters(java.util.Collection<TemplateParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<TemplateParameter>(parameters);
    }

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of <code>TemplateParameter</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateResult withParameters(TemplateParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<TemplateParameter>(parameters.length));
        }
        for (TemplateParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>TemplateParameter</code> structures.
     * </p>
     * 
     * @param parameters
     *        A list of <code>TemplateParameter</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateResult withParameters(java.util.Collection<TemplateParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The description found within the template.
     * </p>
     * 
     * @param description
     *        The description found within the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description found within the template.
     * </p>
     * 
     * @return The description found within the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description found within the template.
     * </p>
     * 
     * @param description
     *        The description found within the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM resources, you must specify the
     * CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @return The capabilities found within the template. If your template contains IAM resources, you must specify the
     *         CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     *         <a>UpdateStack</a> actions with your template; otherwise, those actions return an
     *         InsufficientCapabilities error.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
            capabilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capabilities;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM resources, you must specify the
     * CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. If your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     *        <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities
     *        error.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new com.amazonaws.internal.SdkInternalList<String>(capabilities);
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM resources, you must specify the
     * CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. If your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     *        <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities
     *        error.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public ValidateTemplateResult withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new com.amazonaws.internal.SdkInternalList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM resources, you must specify the
     * CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. If your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     *        <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities
     *        error.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public ValidateTemplateResult withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. If your template contains IAM resources, you must specify the
     * CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. If your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the <a>CreateStack</a> or
     *        <a>UpdateStack</a> actions with your template; otherwise, those actions return an InsufficientCapabilities
     *        error.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public ValidateTemplateResult withCapabilities(Capability... capabilities) {
        com.amazonaws.internal.SdkInternalList<String> capabilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources that generated the values in the <code>Capabilities</code> response element.
     * </p>
     * 
     * @param capabilitiesReason
     *        The list of resources that generated the values in the <code>Capabilities</code> response element.
     */

    public void setCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the <code>Capabilities</code> response element.
     * </p>
     * 
     * @return The list of resources that generated the values in the <code>Capabilities</code> response element.
     */

    public String getCapabilitiesReason() {
        return this.capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the <code>Capabilities</code> response element.
     * </p>
     * 
     * @param capabilitiesReason
     *        The list of resources that generated the values in the <code>Capabilities</code> response element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateResult withCapabilitiesReason(String capabilitiesReason) {
        setCapabilitiesReason(capabilitiesReason);
        return this;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * 
     * @return A list of the transforms that are declared in the template.
     */

    public java.util.List<String> getDeclaredTransforms() {
        if (declaredTransforms == null) {
            declaredTransforms = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return declaredTransforms;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * 
     * @param declaredTransforms
     *        A list of the transforms that are declared in the template.
     */

    public void setDeclaredTransforms(java.util.Collection<String> declaredTransforms) {
        if (declaredTransforms == null) {
            this.declaredTransforms = null;
            return;
        }

        this.declaredTransforms = new com.amazonaws.internal.SdkInternalList<String>(declaredTransforms);
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeclaredTransforms(java.util.Collection)} or {@link #withDeclaredTransforms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param declaredTransforms
     *        A list of the transforms that are declared in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateResult withDeclaredTransforms(String... declaredTransforms) {
        if (this.declaredTransforms == null) {
            setDeclaredTransforms(new com.amazonaws.internal.SdkInternalList<String>(declaredTransforms.length));
        }
        for (String ele : declaredTransforms) {
            this.declaredTransforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the transforms that are declared in the template.
     * </p>
     * 
     * @param declaredTransforms
     *        A list of the transforms that are declared in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateResult withDeclaredTransforms(java.util.Collection<String> declaredTransforms) {
        setDeclaredTransforms(declaredTransforms);
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
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getCapabilitiesReason() != null)
            sb.append("CapabilitiesReason: ").append(getCapabilitiesReason()).append(",");
        if (getDeclaredTransforms() != null)
            sb.append("DeclaredTransforms: ").append(getDeclaredTransforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateTemplateResult == false)
            return false;
        ValidateTemplateResult other = (ValidateTemplateResult) obj;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getCapabilitiesReason() == null ^ this.getCapabilitiesReason() == null)
            return false;
        if (other.getCapabilitiesReason() != null && other.getCapabilitiesReason().equals(this.getCapabilitiesReason()) == false)
            return false;
        if (other.getDeclaredTransforms() == null ^ this.getDeclaredTransforms() == null)
            return false;
        if (other.getDeclaredTransforms() != null && other.getDeclaredTransforms().equals(this.getDeclaredTransforms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getCapabilitiesReason() == null) ? 0 : getCapabilitiesReason().hashCode());
        hashCode = prime * hashCode + ((getDeclaredTransforms() == null) ? 0 : getDeclaredTransforms().hashCode());
        return hashCode;
    }

    @Override
    public ValidateTemplateResult clone() {
        try {
            return (ValidateTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
