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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a type of sensitive data that Amazon Macie found in an S3 bucket while performing
 * automated sensitive data discovery for the bucket. The information also specifies the custom data identifier or
 * managed data identifier that detected the data. This information is available only if automated sensitive data
 * discovery is currently enabled for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Detection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Detection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the custom data
     * identifier that detected the data. Otherwise, this value is null.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The total number of occurrences of the sensitive data.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The unique identifier for the custom data identifier or managed data identifier that detected the sensitive data.
     * For additional details about a specified managed data identifier, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data
     * identifiers</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the custom data identifier or managed data identifier that detected the sensitive data. For a managed
     * data identifier, this value is the same as the unique identifier (id).
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in the
     * bucket's sensitivity score.
     * </p>
     */
    private Boolean suppressed;
    /**
     * <p>
     * The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom data
     * identifier; and, MANAGED, for a managed data identifier.
     * </p>
     */
    private String type;

    /**
     * <p>
     * If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the custom data
     * identifier that detected the data. Otherwise, this value is null.
     * </p>
     * 
     * @param arn
     *        If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the
     *        custom data identifier that detected the data. Otherwise, this value is null.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the custom data
     * identifier that detected the data. Otherwise, this value is null.
     * </p>
     * 
     * @return If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the
     *         custom data identifier that detected the data. Otherwise, this value is null.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the custom data
     * identifier that detected the data. Otherwise, this value is null.
     * </p>
     * 
     * @param arn
     *        If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the
     *        custom data identifier that detected the data. Otherwise, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Detection withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the sensitive data.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data.
     * </p>
     * 
     * @return The total number of occurrences of the sensitive data.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Detection withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier or managed data identifier that detected the sensitive data.
     * For additional details about a specified managed data identifier, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data
     * identifiers</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     * 
     * @param id
     *        The unique identifier for the custom data identifier or managed data identifier that detected the
     *        sensitive data. For additional details about a specified managed data identifier, see <a
     *        href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data
     *        identifiers</a> in the <i>Amazon Macie User Guide</i>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier or managed data identifier that detected the sensitive data.
     * For additional details about a specified managed data identifier, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data
     * identifiers</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     * 
     * @return The unique identifier for the custom data identifier or managed data identifier that detected the
     *         sensitive data. For additional details about a specified managed data identifier, see <a
     *         href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data
     *         identifiers</a> in the <i>Amazon Macie User Guide</i>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier or managed data identifier that detected the sensitive data.
     * For additional details about a specified managed data identifier, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data
     * identifiers</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     * 
     * @param id
     *        The unique identifier for the custom data identifier or managed data identifier that detected the
     *        sensitive data. For additional details about a specified managed data identifier, see <a
     *        href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data
     *        identifiers</a> in the <i>Amazon Macie User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Detection withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the custom data identifier or managed data identifier that detected the sensitive data. For a managed
     * data identifier, this value is the same as the unique identifier (id).
     * </p>
     * 
     * @param name
     *        The name of the custom data identifier or managed data identifier that detected the sensitive data. For a
     *        managed data identifier, this value is the same as the unique identifier (id).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom data identifier or managed data identifier that detected the sensitive data. For a managed
     * data identifier, this value is the same as the unique identifier (id).
     * </p>
     * 
     * @return The name of the custom data identifier or managed data identifier that detected the sensitive data. For a
     *         managed data identifier, this value is the same as the unique identifier (id).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom data identifier or managed data identifier that detected the sensitive data. For a managed
     * data identifier, this value is the same as the unique identifier (id).
     * </p>
     * 
     * @param name
     *        The name of the custom data identifier or managed data identifier that detected the sensitive data. For a
     *        managed data identifier, this value is the same as the unique identifier (id).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Detection withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in the
     * bucket's sensitivity score.
     * </p>
     * 
     * @param suppressed
     *        Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in
     *        the bucket's sensitivity score.
     */

    public void setSuppressed(Boolean suppressed) {
        this.suppressed = suppressed;
    }

    /**
     * <p>
     * Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in the
     * bucket's sensitivity score.
     * </p>
     * 
     * @return Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in
     *         the bucket's sensitivity score.
     */

    public Boolean getSuppressed() {
        return this.suppressed;
    }

    /**
     * <p>
     * Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in the
     * bucket's sensitivity score.
     * </p>
     * 
     * @param suppressed
     *        Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in
     *        the bucket's sensitivity score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Detection withSuppressed(Boolean suppressed) {
        setSuppressed(suppressed);
        return this;
    }

    /**
     * <p>
     * Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in the
     * bucket's sensitivity score.
     * </p>
     * 
     * @return Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in
     *         the bucket's sensitivity score.
     */

    public Boolean isSuppressed() {
        return this.suppressed;
    }

    /**
     * <p>
     * The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom data
     * identifier; and, MANAGED, for a managed data identifier.
     * </p>
     * 
     * @param type
     *        The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom
     *        data identifier; and, MANAGED, for a managed data identifier.
     * @see DataIdentifierType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom data
     * identifier; and, MANAGED, for a managed data identifier.
     * </p>
     * 
     * @return The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom
     *         data identifier; and, MANAGED, for a managed data identifier.
     * @see DataIdentifierType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom data
     * identifier; and, MANAGED, for a managed data identifier.
     * </p>
     * 
     * @param type
     *        The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom
     *        data identifier; and, MANAGED, for a managed data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataIdentifierType
     */

    public Detection withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom data
     * identifier; and, MANAGED, for a managed data identifier.
     * </p>
     * 
     * @param type
     *        The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom
     *        data identifier; and, MANAGED, for a managed data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataIdentifierType
     */

    public Detection withType(DataIdentifierType type) {
        this.type = type.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSuppressed() != null)
            sb.append("Suppressed: ").append(getSuppressed()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Detection == false)
            return false;
        Detection other = (Detection) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSuppressed() == null ^ this.getSuppressed() == null)
            return false;
        if (other.getSuppressed() != null && other.getSuppressed().equals(this.getSuppressed()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSuppressed() == null) ? 0 : getSuppressed().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Detection clone() {
        try {
            return (Detection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.DetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
