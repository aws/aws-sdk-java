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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon EC2 Systems Manager parameter in Parameter Store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Parameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The parameter value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The parameter version.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of
     * the following formats:
     * </p>
     * <p>
     * parameter_name:version
     * </p>
     * <p>
     * parameter_name:label
     * </p>
     */
    private String selector;
    /**
     * <p>
     * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or
     * response from the source.
     * </p>
     */
    private String sourceResult;
    /**
     * <p>
     * Date the parameter was last changed or updated and the parameter version was created.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @return The type of parameter. Valid values include the following: String, String list, Secure string.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public Parameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @see ParameterType
     */

    public void setType(ParameterType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public Parameter withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @return The parameter value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     * 
     * @param version
     *        The parameter version.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     * 
     * @return The parameter version.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     * 
     * @param version
     *        The parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of
     * the following formats:
     * </p>
     * <p>
     * parameter_name:version
     * </p>
     * <p>
     * parameter_name:label
     * </p>
     * 
     * @param selector
     *        Either the version number or the label used to retrieve the parameter value. Specify selectors by using
     *        one of the following formats:</p>
     *        <p>
     *        parameter_name:version
     *        </p>
     *        <p>
     *        parameter_name:label
     */

    public void setSelector(String selector) {
        this.selector = selector;
    }

    /**
     * <p>
     * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of
     * the following formats:
     * </p>
     * <p>
     * parameter_name:version
     * </p>
     * <p>
     * parameter_name:label
     * </p>
     * 
     * @return Either the version number or the label used to retrieve the parameter value. Specify selectors by using
     *         one of the following formats:</p>
     *         <p>
     *         parameter_name:version
     *         </p>
     *         <p>
     *         parameter_name:label
     */

    public String getSelector() {
        return this.selector;
    }

    /**
     * <p>
     * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of
     * the following formats:
     * </p>
     * <p>
     * parameter_name:version
     * </p>
     * <p>
     * parameter_name:label
     * </p>
     * 
     * @param selector
     *        Either the version number or the label used to retrieve the parameter value. Specify selectors by using
     *        one of the following formats:</p>
     *        <p>
     *        parameter_name:version
     *        </p>
     *        <p>
     *        parameter_name:label
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withSelector(String selector) {
        setSelector(selector);
        return this;
    }

    /**
     * <p>
     * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or
     * response from the source.
     * </p>
     * 
     * @param sourceResult
     *        Applies to parameters that reference information in other AWS services. SourceResult is the raw result or
     *        response from the source.
     */

    public void setSourceResult(String sourceResult) {
        this.sourceResult = sourceResult;
    }

    /**
     * <p>
     * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or
     * response from the source.
     * </p>
     * 
     * @return Applies to parameters that reference information in other AWS services. SourceResult is the raw result or
     *         response from the source.
     */

    public String getSourceResult() {
        return this.sourceResult;
    }

    /**
     * <p>
     * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or
     * response from the source.
     * </p>
     * 
     * @param sourceResult
     *        Applies to parameters that reference information in other AWS services. SourceResult is the raw result or
     *        response from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withSourceResult(String sourceResult) {
        setSourceResult(sourceResult);
        return this;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated and the parameter version was created.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date the parameter was last changed or updated and the parameter version was created.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated and the parameter version was created.
     * </p>
     * 
     * @return Date the parameter was last changed or updated and the parameter version was created.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated and the parameter version was created.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date the parameter was last changed or updated and the parameter version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the parameter.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the parameter.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parameter.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withARN(String aRN) {
        setARN(aRN);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getSelector() != null)
            sb.append("Selector: ").append(getSelector()).append(",");
        if (getSourceResult() != null)
            sb.append("SourceResult: ").append(getSourceResult()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getSelector() == null ^ this.getSelector() == null)
            return false;
        if (other.getSelector() != null && other.getSelector().equals(this.getSelector()) == false)
            return false;
        if (other.getSourceResult() == null ^ this.getSourceResult() == null)
            return false;
        if (other.getSourceResult() != null && other.getSourceResult().equals(this.getSourceResult()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSelector() == null) ? 0 : getSelector().hashCode());
        hashCode = prime * hashCode + ((getSourceResult() == null) ? 0 : getSourceResult().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
