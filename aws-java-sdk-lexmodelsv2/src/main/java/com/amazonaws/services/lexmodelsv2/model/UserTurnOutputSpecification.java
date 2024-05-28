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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains results that are output for the user turn by the test execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UserTurnOutputSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnOutputSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about the intent.
     * </p>
     */
    private UserTurnIntentOutput intent;
    /**
     * <p>
     * The contexts that are active in the turn.
     * </p>
     */
    private java.util.List<ActiveContext> activeContexts;
    /**
     * <p>
     * The transcript that is output for the user turn by the test execution.
     * </p>
     */
    private String transcript;

    /**
     * <p>
     * Contains information about the intent.
     * </p>
     * 
     * @param intent
     *        Contains information about the intent.
     */

    public void setIntent(UserTurnIntentOutput intent) {
        this.intent = intent;
    }

    /**
     * <p>
     * Contains information about the intent.
     * </p>
     * 
     * @return Contains information about the intent.
     */

    public UserTurnIntentOutput getIntent() {
        return this.intent;
    }

    /**
     * <p>
     * Contains information about the intent.
     * </p>
     * 
     * @param intent
     *        Contains information about the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnOutputSpecification withIntent(UserTurnIntentOutput intent) {
        setIntent(intent);
        return this;
    }

    /**
     * <p>
     * The contexts that are active in the turn.
     * </p>
     * 
     * @return The contexts that are active in the turn.
     */

    public java.util.List<ActiveContext> getActiveContexts() {
        return activeContexts;
    }

    /**
     * <p>
     * The contexts that are active in the turn.
     * </p>
     * 
     * @param activeContexts
     *        The contexts that are active in the turn.
     */

    public void setActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        if (activeContexts == null) {
            this.activeContexts = null;
            return;
        }

        this.activeContexts = new java.util.ArrayList<ActiveContext>(activeContexts);
    }

    /**
     * <p>
     * The contexts that are active in the turn.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveContexts(java.util.Collection)} or {@link #withActiveContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param activeContexts
     *        The contexts that are active in the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnOutputSpecification withActiveContexts(ActiveContext... activeContexts) {
        if (this.activeContexts == null) {
            setActiveContexts(new java.util.ArrayList<ActiveContext>(activeContexts.length));
        }
        for (ActiveContext ele : activeContexts) {
            this.activeContexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contexts that are active in the turn.
     * </p>
     * 
     * @param activeContexts
     *        The contexts that are active in the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnOutputSpecification withActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        setActiveContexts(activeContexts);
        return this;
    }

    /**
     * <p>
     * The transcript that is output for the user turn by the test execution.
     * </p>
     * 
     * @param transcript
     *        The transcript that is output for the user turn by the test execution.
     */

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * The transcript that is output for the user turn by the test execution.
     * </p>
     * 
     * @return The transcript that is output for the user turn by the test execution.
     */

    public String getTranscript() {
        return this.transcript;
    }

    /**
     * <p>
     * The transcript that is output for the user turn by the test execution.
     * </p>
     * 
     * @param transcript
     *        The transcript that is output for the user turn by the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnOutputSpecification withTranscript(String transcript) {
        setTranscript(transcript);
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
        if (getIntent() != null)
            sb.append("Intent: ").append(getIntent()).append(",");
        if (getActiveContexts() != null)
            sb.append("ActiveContexts: ").append(getActiveContexts()).append(",");
        if (getTranscript() != null)
            sb.append("Transcript: ").append(getTranscript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserTurnOutputSpecification == false)
            return false;
        UserTurnOutputSpecification other = (UserTurnOutputSpecification) obj;
        if (other.getIntent() == null ^ this.getIntent() == null)
            return false;
        if (other.getIntent() != null && other.getIntent().equals(this.getIntent()) == false)
            return false;
        if (other.getActiveContexts() == null ^ this.getActiveContexts() == null)
            return false;
        if (other.getActiveContexts() != null && other.getActiveContexts().equals(this.getActiveContexts()) == false)
            return false;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntent() == null) ? 0 : getIntent().hashCode());
        hashCode = prime * hashCode + ((getActiveContexts() == null) ? 0 : getActiveContexts().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        return hashCode;
    }

    @Override
    public UserTurnOutputSpecification clone() {
        try {
            return (UserTurnOutputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UserTurnOutputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
