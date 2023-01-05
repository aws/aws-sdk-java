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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A system asset that's evaluated in an Audit Manager assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The value of the resource.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The evaluation status for a resource that was assessed when collecting compliance check evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Audit Manager classes the resource as non-compliant if Security Hub reports a <i>Fail</i> result, or if Config
     * reports a <i>Non-compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * Audit Manager classes the resource as compliant if Security Hub reports a <i>Pass</i> result, or if Config
     * reports a <i>Compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a compliance check isn't available or applicable, then no compliance evaluation can be made for that resource.
     * This is the case if a resource assessment uses Config or Security Hub as the underlying data source type, but
     * those services aren't enabled. This is also the case if the resource assessment uses an underlying data source
     * type that doesn't support compliance checks (such as manual evidence, Amazon Web Services API calls, or
     * CloudTrail).
     * </p>
     * </li>
     * </ul>
     */
    private String complianceCheck;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The value of the resource.
     * </p>
     * 
     * @param value
     *        The value of the resource.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the resource.
     * </p>
     * 
     * @return The value of the resource.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the resource.
     * </p>
     * 
     * @param value
     *        The value of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The evaluation status for a resource that was assessed when collecting compliance check evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Audit Manager classes the resource as non-compliant if Security Hub reports a <i>Fail</i> result, or if Config
     * reports a <i>Non-compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * Audit Manager classes the resource as compliant if Security Hub reports a <i>Pass</i> result, or if Config
     * reports a <i>Compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a compliance check isn't available or applicable, then no compliance evaluation can be made for that resource.
     * This is the case if a resource assessment uses Config or Security Hub as the underlying data source type, but
     * those services aren't enabled. This is also the case if the resource assessment uses an underlying data source
     * type that doesn't support compliance checks (such as manual evidence, Amazon Web Services API calls, or
     * CloudTrail).
     * </p>
     * </li>
     * </ul>
     * 
     * @param complianceCheck
     *        The evaluation status for a resource that was assessed when collecting compliance check evidence. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Audit Manager classes the resource as non-compliant if Security Hub reports a <i>Fail</i> result, or if
     *        Config reports a <i>Non-compliant</i> result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Audit Manager classes the resource as compliant if Security Hub reports a <i>Pass</i> result, or if Config
     *        reports a <i>Compliant</i> result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a compliance check isn't available or applicable, then no compliance evaluation can be made for that
     *        resource. This is the case if a resource assessment uses Config or Security Hub as the underlying data
     *        source type, but those services aren't enabled. This is also the case if the resource assessment uses an
     *        underlying data source type that doesn't support compliance checks (such as manual evidence, Amazon Web
     *        Services API calls, or CloudTrail).
     *        </p>
     *        </li>
     */

    public void setComplianceCheck(String complianceCheck) {
        this.complianceCheck = complianceCheck;
    }

    /**
     * <p>
     * The evaluation status for a resource that was assessed when collecting compliance check evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Audit Manager classes the resource as non-compliant if Security Hub reports a <i>Fail</i> result, or if Config
     * reports a <i>Non-compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * Audit Manager classes the resource as compliant if Security Hub reports a <i>Pass</i> result, or if Config
     * reports a <i>Compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a compliance check isn't available or applicable, then no compliance evaluation can be made for that resource.
     * This is the case if a resource assessment uses Config or Security Hub as the underlying data source type, but
     * those services aren't enabled. This is also the case if the resource assessment uses an underlying data source
     * type that doesn't support compliance checks (such as manual evidence, Amazon Web Services API calls, or
     * CloudTrail).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The evaluation status for a resource that was assessed when collecting compliance check evidence. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Audit Manager classes the resource as non-compliant if Security Hub reports a <i>Fail</i> result, or if
     *         Config reports a <i>Non-compliant</i> result.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Audit Manager classes the resource as compliant if Security Hub reports a <i>Pass</i> result, or if
     *         Config reports a <i>Compliant</i> result.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a compliance check isn't available or applicable, then no compliance evaluation can be made for that
     *         resource. This is the case if a resource assessment uses Config or Security Hub as the underlying data
     *         source type, but those services aren't enabled. This is also the case if the resource assessment uses an
     *         underlying data source type that doesn't support compliance checks (such as manual evidence, Amazon Web
     *         Services API calls, or CloudTrail).
     *         </p>
     *         </li>
     */

    public String getComplianceCheck() {
        return this.complianceCheck;
    }

    /**
     * <p>
     * The evaluation status for a resource that was assessed when collecting compliance check evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Audit Manager classes the resource as non-compliant if Security Hub reports a <i>Fail</i> result, or if Config
     * reports a <i>Non-compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * Audit Manager classes the resource as compliant if Security Hub reports a <i>Pass</i> result, or if Config
     * reports a <i>Compliant</i> result.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a compliance check isn't available or applicable, then no compliance evaluation can be made for that resource.
     * This is the case if a resource assessment uses Config or Security Hub as the underlying data source type, but
     * those services aren't enabled. This is also the case if the resource assessment uses an underlying data source
     * type that doesn't support compliance checks (such as manual evidence, Amazon Web Services API calls, or
     * CloudTrail).
     * </p>
     * </li>
     * </ul>
     * 
     * @param complianceCheck
     *        The evaluation status for a resource that was assessed when collecting compliance check evidence. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Audit Manager classes the resource as non-compliant if Security Hub reports a <i>Fail</i> result, or if
     *        Config reports a <i>Non-compliant</i> result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Audit Manager classes the resource as compliant if Security Hub reports a <i>Pass</i> result, or if Config
     *        reports a <i>Compliant</i> result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a compliance check isn't available or applicable, then no compliance evaluation can be made for that
     *        resource. This is the case if a resource assessment uses Config or Security Hub as the underlying data
     *        source type, but those services aren't enabled. This is also the case if the resource assessment uses an
     *        underlying data source type that doesn't support compliance checks (such as manual evidence, Amazon Web
     *        Services API calls, or CloudTrail).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withComplianceCheck(String complianceCheck) {
        setComplianceCheck(complianceCheck);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getComplianceCheck() != null)
            sb.append("ComplianceCheck: ").append(getComplianceCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComplianceCheck() == null ^ this.getComplianceCheck() == null)
            return false;
        if (other.getComplianceCheck() != null && other.getComplianceCheck().equals(this.getComplianceCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComplianceCheck() == null) ? 0 : getComplianceCheck().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
