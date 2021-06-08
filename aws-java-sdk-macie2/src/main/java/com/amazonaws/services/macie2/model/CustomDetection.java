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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a custom data identifier that produced a sensitive data finding, and the sensitive data
 * that it detected for the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CustomDetection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The total number of occurrences of the sensitive data that the custom data identifier detected.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding
     * includes location data for a maximum of 15 occurrences of sensitive data.
     * </p>
     */
    private Occurrences occurrences;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom data identifier.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom data identifier.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDetection withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that the custom data identifier detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the sensitive data that the custom data identifier detected.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that the custom data identifier detected.
     * </p>
     * 
     * @return The total number of occurrences of the sensitive data that the custom data identifier detected.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that the custom data identifier detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the sensitive data that the custom data identifier detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDetection withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     * 
     * @param name
     *        The name of the custom data identifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     * 
     * @return The name of the custom data identifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     * 
     * @param name
     *        The name of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDetection withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding
     * includes location data for a maximum of 15 occurrences of sensitive data.
     * </p>
     * 
     * @param occurrences
     *        The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding
     *        includes location data for a maximum of 15 occurrences of sensitive data.
     */

    public void setOccurrences(Occurrences occurrences) {
        this.occurrences = occurrences;
    }

    /**
     * <p>
     * The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding
     * includes location data for a maximum of 15 occurrences of sensitive data.
     * </p>
     * 
     * @return The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A
     *         finding includes location data for a maximum of 15 occurrences of sensitive data.
     */

    public Occurrences getOccurrences() {
        return this.occurrences;
    }

    /**
     * <p>
     * The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding
     * includes location data for a maximum of 15 occurrences of sensitive data.
     * </p>
     * 
     * @param occurrences
     *        The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding
     *        includes location data for a maximum of 15 occurrences of sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDetection withOccurrences(Occurrences occurrences) {
        setOccurrences(occurrences);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOccurrences() != null)
            sb.append("Occurrences: ").append(getOccurrences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDetection == false)
            return false;
        CustomDetection other = (CustomDetection) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOccurrences() == null ^ this.getOccurrences() == null)
            return false;
        if (other.getOccurrences() != null && other.getOccurrences().equals(this.getOccurrences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOccurrences() == null) ? 0 : getOccurrences().hashCode());
        return hashCode;
    }

    @Override
    public CustomDetection clone() {
        try {
            return (CustomDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.CustomDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
