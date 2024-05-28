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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detective investigations triages indicators of compromises such as a finding and surfaces only the most critical and
 * suspicious issues, so you can focus on high-level investigations. An <code>Indicator</code> lets you determine if an
 * Amazon Web Services resource is involved in unusual activity that could indicate malicious behavior and its impact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/Indicator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Indicator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of indicator.
     * </p>
     */
    private String indicatorType;
    /**
     * <p>
     * Details about the indicators of compromise that are used to determine if a resource is involved in a security
     * incident. An indicator of compromise (IOC) is an artifact observed in or on a network, system, or environment
     * that can (with a high level of confidence) identify malicious activity or a security incident.
     * </p>
     */
    private IndicatorDetail indicatorDetail;

    /**
     * <p>
     * The type of indicator.
     * </p>
     * 
     * @param indicatorType
     *        The type of indicator.
     * @see IndicatorType
     */

    public void setIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
    }

    /**
     * <p>
     * The type of indicator.
     * </p>
     * 
     * @return The type of indicator.
     * @see IndicatorType
     */

    public String getIndicatorType() {
        return this.indicatorType;
    }

    /**
     * <p>
     * The type of indicator.
     * </p>
     * 
     * @param indicatorType
     *        The type of indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndicatorType
     */

    public Indicator withIndicatorType(String indicatorType) {
        setIndicatorType(indicatorType);
        return this;
    }

    /**
     * <p>
     * The type of indicator.
     * </p>
     * 
     * @param indicatorType
     *        The type of indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndicatorType
     */

    public Indicator withIndicatorType(IndicatorType indicatorType) {
        this.indicatorType = indicatorType.toString();
        return this;
    }

    /**
     * <p>
     * Details about the indicators of compromise that are used to determine if a resource is involved in a security
     * incident. An indicator of compromise (IOC) is an artifact observed in or on a network, system, or environment
     * that can (with a high level of confidence) identify malicious activity or a security incident.
     * </p>
     * 
     * @param indicatorDetail
     *        Details about the indicators of compromise that are used to determine if a resource is involved in a
     *        security incident. An indicator of compromise (IOC) is an artifact observed in or on a network, system, or
     *        environment that can (with a high level of confidence) identify malicious activity or a security incident.
     */

    public void setIndicatorDetail(IndicatorDetail indicatorDetail) {
        this.indicatorDetail = indicatorDetail;
    }

    /**
     * <p>
     * Details about the indicators of compromise that are used to determine if a resource is involved in a security
     * incident. An indicator of compromise (IOC) is an artifact observed in or on a network, system, or environment
     * that can (with a high level of confidence) identify malicious activity or a security incident.
     * </p>
     * 
     * @return Details about the indicators of compromise that are used to determine if a resource is involved in a
     *         security incident. An indicator of compromise (IOC) is an artifact observed in or on a network, system,
     *         or environment that can (with a high level of confidence) identify malicious activity or a security
     *         incident.
     */

    public IndicatorDetail getIndicatorDetail() {
        return this.indicatorDetail;
    }

    /**
     * <p>
     * Details about the indicators of compromise that are used to determine if a resource is involved in a security
     * incident. An indicator of compromise (IOC) is an artifact observed in or on a network, system, or environment
     * that can (with a high level of confidence) identify malicious activity or a security incident.
     * </p>
     * 
     * @param indicatorDetail
     *        Details about the indicators of compromise that are used to determine if a resource is involved in a
     *        security incident. An indicator of compromise (IOC) is an artifact observed in or on a network, system, or
     *        environment that can (with a high level of confidence) identify malicious activity or a security incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Indicator withIndicatorDetail(IndicatorDetail indicatorDetail) {
        setIndicatorDetail(indicatorDetail);
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
        if (getIndicatorType() != null)
            sb.append("IndicatorType: ").append(getIndicatorType()).append(",");
        if (getIndicatorDetail() != null)
            sb.append("IndicatorDetail: ").append(getIndicatorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Indicator == false)
            return false;
        Indicator other = (Indicator) obj;
        if (other.getIndicatorType() == null ^ this.getIndicatorType() == null)
            return false;
        if (other.getIndicatorType() != null && other.getIndicatorType().equals(this.getIndicatorType()) == false)
            return false;
        if (other.getIndicatorDetail() == null ^ this.getIndicatorDetail() == null)
            return false;
        if (other.getIndicatorDetail() != null && other.getIndicatorDetail().equals(this.getIndicatorDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndicatorType() == null) ? 0 : getIndicatorType().hashCode());
        hashCode = prime * hashCode + ((getIndicatorDetail() == null) ? 0 : getIndicatorDetail().hashCode());
        return hashCode;
    }

    @Override
    public Indicator clone() {
        try {
            return (Indicator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.IndicatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
