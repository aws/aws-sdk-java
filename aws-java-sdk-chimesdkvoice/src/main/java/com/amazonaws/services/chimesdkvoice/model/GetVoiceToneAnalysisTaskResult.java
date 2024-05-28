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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceToneAnalysisTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVoiceToneAnalysisTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the voice tone analysis task.
     * </p>
     */
    private VoiceToneAnalysisTask voiceToneAnalysisTask;

    /**
     * <p>
     * The details of the voice tone analysis task.
     * </p>
     * 
     * @param voiceToneAnalysisTask
     *        The details of the voice tone analysis task.
     */

    public void setVoiceToneAnalysisTask(VoiceToneAnalysisTask voiceToneAnalysisTask) {
        this.voiceToneAnalysisTask = voiceToneAnalysisTask;
    }

    /**
     * <p>
     * The details of the voice tone analysis task.
     * </p>
     * 
     * @return The details of the voice tone analysis task.
     */

    public VoiceToneAnalysisTask getVoiceToneAnalysisTask() {
        return this.voiceToneAnalysisTask;
    }

    /**
     * <p>
     * The details of the voice tone analysis task.
     * </p>
     * 
     * @param voiceToneAnalysisTask
     *        The details of the voice tone analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVoiceToneAnalysisTaskResult withVoiceToneAnalysisTask(VoiceToneAnalysisTask voiceToneAnalysisTask) {
        setVoiceToneAnalysisTask(voiceToneAnalysisTask);
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
        if (getVoiceToneAnalysisTask() != null)
            sb.append("VoiceToneAnalysisTask: ").append(getVoiceToneAnalysisTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceToneAnalysisTaskResult == false)
            return false;
        GetVoiceToneAnalysisTaskResult other = (GetVoiceToneAnalysisTaskResult) obj;
        if (other.getVoiceToneAnalysisTask() == null ^ this.getVoiceToneAnalysisTask() == null)
            return false;
        if (other.getVoiceToneAnalysisTask() != null && other.getVoiceToneAnalysisTask().equals(this.getVoiceToneAnalysisTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceToneAnalysisTask() == null) ? 0 : getVoiceToneAnalysisTask().hashCode());
        return hashCode;
    }

    @Override
    public GetVoiceToneAnalysisTaskResult clone() {
        try {
            return (GetVoiceToneAnalysisTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
