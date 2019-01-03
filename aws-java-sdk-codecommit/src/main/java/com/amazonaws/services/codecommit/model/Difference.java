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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a set of differences for a commit specifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Difference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Difference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     */
    private BlobMetadata beforeBlob;
    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     */
    private BlobMetadata afterBlob;
    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * </p>
     */
    private String changeType;

    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     * 
     * @param beforeBlob
     *        Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission
     *        code, and the path.
     */

    public void setBeforeBlob(BlobMetadata beforeBlob) {
        this.beforeBlob = beforeBlob;
    }

    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     * 
     * @return Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission
     *         code, and the path.
     */

    public BlobMetadata getBeforeBlob() {
        return this.beforeBlob;
    }

    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     * 
     * @param beforeBlob
     *        Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission
     *        code, and the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Difference withBeforeBlob(BlobMetadata beforeBlob) {
        setBeforeBlob(beforeBlob);
        return this;
    }

    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     * 
     * @param afterBlob
     *        Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission
     *        code, and the path.
     */

    public void setAfterBlob(BlobMetadata afterBlob) {
        this.afterBlob = afterBlob;
    }

    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     * 
     * @return Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission
     *         code, and the path.
     */

    public BlobMetadata getAfterBlob() {
        return this.afterBlob;
    }

    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code,
     * and the path.
     * </p>
     * 
     * @param afterBlob
     *        Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission
     *        code, and the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Difference withAfterBlob(BlobMetadata afterBlob) {
        setAfterBlob(afterBlob);
        return this;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * </p>
     * 
     * @param changeType
     *        Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * @see ChangeTypeEnum
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * </p>
     * 
     * @return Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * @see ChangeTypeEnum
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * </p>
     * 
     * @param changeType
     *        Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTypeEnum
     */

    public Difference withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * </p>
     * 
     * @param changeType
     *        Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * @see ChangeTypeEnum
     */

    public void setChangeType(ChangeTypeEnum changeType) {
        withChangeType(changeType);
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * </p>
     * 
     * @param changeType
     *        Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTypeEnum
     */

    public Difference withChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType.toString();
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
        if (getBeforeBlob() != null)
            sb.append("BeforeBlob: ").append(getBeforeBlob()).append(",");
        if (getAfterBlob() != null)
            sb.append("AfterBlob: ").append(getAfterBlob()).append(",");
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Difference == false)
            return false;
        Difference other = (Difference) obj;
        if (other.getBeforeBlob() == null ^ this.getBeforeBlob() == null)
            return false;
        if (other.getBeforeBlob() != null && other.getBeforeBlob().equals(this.getBeforeBlob()) == false)
            return false;
        if (other.getAfterBlob() == null ^ this.getAfterBlob() == null)
            return false;
        if (other.getAfterBlob() != null && other.getAfterBlob().equals(this.getAfterBlob()) == false)
            return false;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeforeBlob() == null) ? 0 : getBeforeBlob().hashCode());
        hashCode = prime * hashCode + ((getAfterBlob() == null) ? 0 : getAfterBlob().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        return hashCode;
    }

    @Override
    public Difference clone() {
        try {
            return (Difference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.DifferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
