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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A tructures that contains information about one pattern token related to an anomaly.
 * </p>
 * <p>
 * For more information about patterns and tokens, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateLogAnomalyDetector.html"
 * >CreateLogAnomalyDetector</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PatternToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatternToken implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For a dynamic token, this indicates where in the pattern that this token appears, related to other dynamic
     * tokens. The dynamic token that appears first has a value of <code>1</code>, the one that appears second is
     * <code>2</code>, and so on.
     * </p>
     */
    private Integer dynamicTokenPosition;
    /**
     * <p>
     * Specifies whether this is a dynamic token.
     * </p>
     */
    private Boolean isDynamic;
    /**
     * <p>
     * The string represented by this token. If this is a dynamic token, the value will be <code>&lt;*&gt;</code>
     * </p>
     */
    private String tokenString;
    /**
     * <p>
     * Contains the values found for a dynamic token, and the number of times each value was found.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, Long> enumerations;

    /**
     * <p>
     * For a dynamic token, this indicates where in the pattern that this token appears, related to other dynamic
     * tokens. The dynamic token that appears first has a value of <code>1</code>, the one that appears second is
     * <code>2</code>, and so on.
     * </p>
     * 
     * @param dynamicTokenPosition
     *        For a dynamic token, this indicates where in the pattern that this token appears, related to other dynamic
     *        tokens. The dynamic token that appears first has a value of <code>1</code>, the one that appears second is
     *        <code>2</code>, and so on.
     */

    public void setDynamicTokenPosition(Integer dynamicTokenPosition) {
        this.dynamicTokenPosition = dynamicTokenPosition;
    }

    /**
     * <p>
     * For a dynamic token, this indicates where in the pattern that this token appears, related to other dynamic
     * tokens. The dynamic token that appears first has a value of <code>1</code>, the one that appears second is
     * <code>2</code>, and so on.
     * </p>
     * 
     * @return For a dynamic token, this indicates where in the pattern that this token appears, related to other
     *         dynamic tokens. The dynamic token that appears first has a value of <code>1</code>, the one that appears
     *         second is <code>2</code>, and so on.
     */

    public Integer getDynamicTokenPosition() {
        return this.dynamicTokenPosition;
    }

    /**
     * <p>
     * For a dynamic token, this indicates where in the pattern that this token appears, related to other dynamic
     * tokens. The dynamic token that appears first has a value of <code>1</code>, the one that appears second is
     * <code>2</code>, and so on.
     * </p>
     * 
     * @param dynamicTokenPosition
     *        For a dynamic token, this indicates where in the pattern that this token appears, related to other dynamic
     *        tokens. The dynamic token that appears first has a value of <code>1</code>, the one that appears second is
     *        <code>2</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternToken withDynamicTokenPosition(Integer dynamicTokenPosition) {
        setDynamicTokenPosition(dynamicTokenPosition);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is a dynamic token.
     * </p>
     * 
     * @param isDynamic
     *        Specifies whether this is a dynamic token.
     */

    public void setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    /**
     * <p>
     * Specifies whether this is a dynamic token.
     * </p>
     * 
     * @return Specifies whether this is a dynamic token.
     */

    public Boolean getIsDynamic() {
        return this.isDynamic;
    }

    /**
     * <p>
     * Specifies whether this is a dynamic token.
     * </p>
     * 
     * @param isDynamic
     *        Specifies whether this is a dynamic token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternToken withIsDynamic(Boolean isDynamic) {
        setIsDynamic(isDynamic);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is a dynamic token.
     * </p>
     * 
     * @return Specifies whether this is a dynamic token.
     */

    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * <p>
     * The string represented by this token. If this is a dynamic token, the value will be <code>&lt;*&gt;</code>
     * </p>
     * 
     * @param tokenString
     *        The string represented by this token. If this is a dynamic token, the value will be <code>&lt;*&gt;</code>
     */

    public void setTokenString(String tokenString) {
        this.tokenString = tokenString;
    }

    /**
     * <p>
     * The string represented by this token. If this is a dynamic token, the value will be <code>&lt;*&gt;</code>
     * </p>
     * 
     * @return The string represented by this token. If this is a dynamic token, the value will be
     *         <code>&lt;*&gt;</code>
     */

    public String getTokenString() {
        return this.tokenString;
    }

    /**
     * <p>
     * The string represented by this token. If this is a dynamic token, the value will be <code>&lt;*&gt;</code>
     * </p>
     * 
     * @param tokenString
     *        The string represented by this token. If this is a dynamic token, the value will be <code>&lt;*&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternToken withTokenString(String tokenString) {
        setTokenString(tokenString);
        return this;
    }

    /**
     * <p>
     * Contains the values found for a dynamic token, and the number of times each value was found.
     * </p>
     * 
     * @return Contains the values found for a dynamic token, and the number of times each value was found.
     */

    public java.util.Map<String, Long> getEnumerations() {
        if (enumerations == null) {
            enumerations = new com.amazonaws.internal.SdkInternalMap<String, Long>();
        }
        return enumerations;
    }

    /**
     * <p>
     * Contains the values found for a dynamic token, and the number of times each value was found.
     * </p>
     * 
     * @param enumerations
     *        Contains the values found for a dynamic token, and the number of times each value was found.
     */

    public void setEnumerations(java.util.Map<String, Long> enumerations) {
        this.enumerations = enumerations == null ? null : new com.amazonaws.internal.SdkInternalMap<String, Long>(enumerations);
    }

    /**
     * <p>
     * Contains the values found for a dynamic token, and the number of times each value was found.
     * </p>
     * 
     * @param enumerations
     *        Contains the values found for a dynamic token, and the number of times each value was found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternToken withEnumerations(java.util.Map<String, Long> enumerations) {
        setEnumerations(enumerations);
        return this;
    }

    /**
     * Add a single Enumerations entry
     *
     * @see PatternToken#withEnumerations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PatternToken addEnumerationsEntry(String key, Long value) {
        if (null == this.enumerations) {
            this.enumerations = new com.amazonaws.internal.SdkInternalMap<String, Long>();
        }
        if (this.enumerations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.enumerations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Enumerations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternToken clearEnumerationsEntries() {
        this.enumerations = null;
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
        if (getDynamicTokenPosition() != null)
            sb.append("DynamicTokenPosition: ").append(getDynamicTokenPosition()).append(",");
        if (getIsDynamic() != null)
            sb.append("IsDynamic: ").append(getIsDynamic()).append(",");
        if (getTokenString() != null)
            sb.append("TokenString: ").append(getTokenString()).append(",");
        if (getEnumerations() != null)
            sb.append("Enumerations: ").append(getEnumerations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatternToken == false)
            return false;
        PatternToken other = (PatternToken) obj;
        if (other.getDynamicTokenPosition() == null ^ this.getDynamicTokenPosition() == null)
            return false;
        if (other.getDynamicTokenPosition() != null && other.getDynamicTokenPosition().equals(this.getDynamicTokenPosition()) == false)
            return false;
        if (other.getIsDynamic() == null ^ this.getIsDynamic() == null)
            return false;
        if (other.getIsDynamic() != null && other.getIsDynamic().equals(this.getIsDynamic()) == false)
            return false;
        if (other.getTokenString() == null ^ this.getTokenString() == null)
            return false;
        if (other.getTokenString() != null && other.getTokenString().equals(this.getTokenString()) == false)
            return false;
        if (other.getEnumerations() == null ^ this.getEnumerations() == null)
            return false;
        if (other.getEnumerations() != null && other.getEnumerations().equals(this.getEnumerations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamicTokenPosition() == null) ? 0 : getDynamicTokenPosition().hashCode());
        hashCode = prime * hashCode + ((getIsDynamic() == null) ? 0 : getIsDynamic().hashCode());
        hashCode = prime * hashCode + ((getTokenString() == null) ? 0 : getTokenString().hashCode());
        hashCode = prime * hashCode + ((getEnumerations() == null) ? 0 : getEnumerations().hashCode());
        return hashCode;
    }

    @Override
    public PatternToken clone() {
        try {
            return (PatternToken) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.PatternTokenMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
