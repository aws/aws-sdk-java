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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListSpeechSynthesisTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSpeechSynthesisTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in this request. If present, this indicates
     * where to continue the listing.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of SynthesisTask objects that provides information from the specified task in the list request, including
     * output format, creation time, task status, and so on.
     * </p>
     */
    private java.util.List<SynthesisTask> synthesisTasks;

    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in this request. If present, this indicates
     * where to continue the listing.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token returned from the previous List operation in this request. If present, this
     *        indicates where to continue the listing.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in this request. If present, this indicates
     * where to continue the listing.
     * </p>
     * 
     * @return An opaque pagination token returned from the previous List operation in this request. If present, this
     *         indicates where to continue the listing.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in this request. If present, this indicates
     * where to continue the listing.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token returned from the previous List operation in this request. If present, this
     *        indicates where to continue the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpeechSynthesisTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the specified task in the list request, including
     * output format, creation time, task status, and so on.
     * </p>
     * 
     * @return List of SynthesisTask objects that provides information from the specified task in the list request,
     *         including output format, creation time, task status, and so on.
     */

    public java.util.List<SynthesisTask> getSynthesisTasks() {
        return synthesisTasks;
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the specified task in the list request, including
     * output format, creation time, task status, and so on.
     * </p>
     * 
     * @param synthesisTasks
     *        List of SynthesisTask objects that provides information from the specified task in the list request,
     *        including output format, creation time, task status, and so on.
     */

    public void setSynthesisTasks(java.util.Collection<SynthesisTask> synthesisTasks) {
        if (synthesisTasks == null) {
            this.synthesisTasks = null;
            return;
        }

        this.synthesisTasks = new java.util.ArrayList<SynthesisTask>(synthesisTasks);
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the specified task in the list request, including
     * output format, creation time, task status, and so on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSynthesisTasks(java.util.Collection)} or {@link #withSynthesisTasks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param synthesisTasks
     *        List of SynthesisTask objects that provides information from the specified task in the list request,
     *        including output format, creation time, task status, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpeechSynthesisTasksResult withSynthesisTasks(SynthesisTask... synthesisTasks) {
        if (this.synthesisTasks == null) {
            setSynthesisTasks(new java.util.ArrayList<SynthesisTask>(synthesisTasks.length));
        }
        for (SynthesisTask ele : synthesisTasks) {
            this.synthesisTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the specified task in the list request, including
     * output format, creation time, task status, and so on.
     * </p>
     * 
     * @param synthesisTasks
     *        List of SynthesisTask objects that provides information from the specified task in the list request,
     *        including output format, creation time, task status, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpeechSynthesisTasksResult withSynthesisTasks(java.util.Collection<SynthesisTask> synthesisTasks) {
        setSynthesisTasks(synthesisTasks);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSynthesisTasks() != null)
            sb.append("SynthesisTasks: ").append(getSynthesisTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSpeechSynthesisTasksResult == false)
            return false;
        ListSpeechSynthesisTasksResult other = (ListSpeechSynthesisTasksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSynthesisTasks() == null ^ this.getSynthesisTasks() == null)
            return false;
        if (other.getSynthesisTasks() != null && other.getSynthesisTasks().equals(this.getSynthesisTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSynthesisTasks() == null) ? 0 : getSynthesisTasks().hashCode());
        return hashCode;
    }

    @Override
    public ListSpeechSynthesisTasksResult clone() {
        try {
            return (ListSpeechSynthesisTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
