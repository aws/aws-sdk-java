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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of detected instances of sensitive data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CustomDataIdentifiersDetections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDataIdentifiersDetections implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The ARN of the custom identifier that was used to detect the sensitive data.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * he name of the custom identifier that detected the sensitive data.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     */
    private Occurrences occurrences;

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of sensitive data that were detected.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     * 
     * @return The total number of occurrences of sensitive data that were detected.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of sensitive data that were detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDataIdentifiersDetections withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The ARN of the custom identifier that was used to detect the sensitive data.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom identifier that was used to detect the sensitive data.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the custom identifier that was used to detect the sensitive data.
     * </p>
     * 
     * @return The ARN of the custom identifier that was used to detect the sensitive data.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the custom identifier that was used to detect the sensitive data.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom identifier that was used to detect the sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDataIdentifiersDetections withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * he name of the custom identifier that detected the sensitive data.
     * </p>
     * 
     * @param name
     *        he name of the custom identifier that detected the sensitive data.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * he name of the custom identifier that detected the sensitive data.
     * </p>
     * 
     * @return he name of the custom identifier that detected the sensitive data.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * he name of the custom identifier that detected the sensitive data.
     * </p>
     * 
     * @param name
     *        he name of the custom identifier that detected the sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDataIdentifiersDetections withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     * 
     * @param occurrences
     *        Details about the sensitive data that was detected.
     */

    public void setOccurrences(Occurrences occurrences) {
        this.occurrences = occurrences;
    }

    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     * 
     * @return Details about the sensitive data that was detected.
     */

    public Occurrences getOccurrences() {
        return this.occurrences;
    }

    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     * 
     * @param occurrences
     *        Details about the sensitive data that was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDataIdentifiersDetections withOccurrences(Occurrences occurrences) {
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof CustomDataIdentifiersDetections == false)
            return false;
        CustomDataIdentifiersDetections other = (CustomDataIdentifiersDetections) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOccurrences() == null) ? 0 : getOccurrences().hashCode());
        return hashCode;
    }

    @Override
    public CustomDataIdentifiersDetections clone() {
        try {
            return (CustomDataIdentifiersDetections) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.CustomDataIdentifiersDetectionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
