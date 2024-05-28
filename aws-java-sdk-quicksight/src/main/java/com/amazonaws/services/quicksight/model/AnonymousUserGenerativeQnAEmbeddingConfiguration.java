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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings that you want to use for the Generative Q&amp;A experience.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnonymousUserGenerativeQnAEmbeddingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnonymousUserGenerativeQnAEmbeddingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon QuickSight Q topic ID of the new reader experience topic that you want the anonymous user to see
     * first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders the
     * Generative Q&amp;A experience with this new reader experience topic pre selected.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this Q new reader experience topic must be included in the
     * <code>AuthorizedResourceArns</code> parameter. Otherwise, the request fails with an
     * <code>InvalidParameterValueException</code> error.
     * </p>
     */
    private String initialTopicId;

    /**
     * <p>
     * The Amazon QuickSight Q topic ID of the new reader experience topic that you want the anonymous user to see
     * first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders the
     * Generative Q&amp;A experience with this new reader experience topic pre selected.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this Q new reader experience topic must be included in the
     * <code>AuthorizedResourceArns</code> parameter. Otherwise, the request fails with an
     * <code>InvalidParameterValueException</code> error.
     * </p>
     * 
     * @param initialTopicId
     *        The Amazon QuickSight Q topic ID of the new reader experience topic that you want the anonymous user to
     *        see first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight
     *        renders the Generative Q&amp;A experience with this new reader experience topic pre selected.</p>
     *        <p>
     *        The Amazon Resource Name (ARN) of this Q new reader experience topic must be included in the
     *        <code>AuthorizedResourceArns</code> parameter. Otherwise, the request fails with an
     *        <code>InvalidParameterValueException</code> error.
     */

    public void setInitialTopicId(String initialTopicId) {
        this.initialTopicId = initialTopicId;
    }

    /**
     * <p>
     * The Amazon QuickSight Q topic ID of the new reader experience topic that you want the anonymous user to see
     * first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders the
     * Generative Q&amp;A experience with this new reader experience topic pre selected.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this Q new reader experience topic must be included in the
     * <code>AuthorizedResourceArns</code> parameter. Otherwise, the request fails with an
     * <code>InvalidParameterValueException</code> error.
     * </p>
     * 
     * @return The Amazon QuickSight Q topic ID of the new reader experience topic that you want the anonymous user to
     *         see first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight
     *         renders the Generative Q&amp;A experience with this new reader experience topic pre selected.</p>
     *         <p>
     *         The Amazon Resource Name (ARN) of this Q new reader experience topic must be included in the
     *         <code>AuthorizedResourceArns</code> parameter. Otherwise, the request fails with an
     *         <code>InvalidParameterValueException</code> error.
     */

    public String getInitialTopicId() {
        return this.initialTopicId;
    }

    /**
     * <p>
     * The Amazon QuickSight Q topic ID of the new reader experience topic that you want the anonymous user to see
     * first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders the
     * Generative Q&amp;A experience with this new reader experience topic pre selected.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this Q new reader experience topic must be included in the
     * <code>AuthorizedResourceArns</code> parameter. Otherwise, the request fails with an
     * <code>InvalidParameterValueException</code> error.
     * </p>
     * 
     * @param initialTopicId
     *        The Amazon QuickSight Q topic ID of the new reader experience topic that you want the anonymous user to
     *        see first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight
     *        renders the Generative Q&amp;A experience with this new reader experience topic pre selected.</p>
     *        <p>
     *        The Amazon Resource Name (ARN) of this Q new reader experience topic must be included in the
     *        <code>AuthorizedResourceArns</code> parameter. Otherwise, the request fails with an
     *        <code>InvalidParameterValueException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnonymousUserGenerativeQnAEmbeddingConfiguration withInitialTopicId(String initialTopicId) {
        setInitialTopicId(initialTopicId);
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
        if (getInitialTopicId() != null)
            sb.append("InitialTopicId: ").append(getInitialTopicId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnonymousUserGenerativeQnAEmbeddingConfiguration == false)
            return false;
        AnonymousUserGenerativeQnAEmbeddingConfiguration other = (AnonymousUserGenerativeQnAEmbeddingConfiguration) obj;
        if (other.getInitialTopicId() == null ^ this.getInitialTopicId() == null)
            return false;
        if (other.getInitialTopicId() != null && other.getInitialTopicId().equals(this.getInitialTopicId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialTopicId() == null) ? 0 : getInitialTopicId().hashCode());
        return hashCode;
    }

    @Override
    public AnonymousUserGenerativeQnAEmbeddingConfiguration clone() {
        try {
            return (AnonymousUserGenerativeQnAEmbeddingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnonymousUserGenerativeQnAEmbeddingConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
