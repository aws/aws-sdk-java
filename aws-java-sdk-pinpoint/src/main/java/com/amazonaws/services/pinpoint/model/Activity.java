/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration and other settings for an activity in a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Activity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Activity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends participants down one of two paths in a
     * journey, based on conditions that you specify.
     * </p>
     */
    private ConditionalSplitActivity conditionalSplit;
    /**
     * <p>
     * The custom description of the activity.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email message to participants.
     * </p>
     */
    private EmailMessageActivity eMAIL;
    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a journey for a specified percentage of
     * participants.
     * </p>
     */
    private HoldoutActivity holdout;
    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity sends participants down one of as many as
     * five paths (including a default <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     */
    private MultiConditionalSplitActivity multiCondition;
    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly sends specified percentages of
     * participants down one of as many as five paths in a journey, based on conditions that you specify.
     * </p>
     */
    private RandomSplitActivity randomSplit;
    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a certain amount of time or until a specific
     * date and time before moving participants to the next activity in a journey.
     * </p>
     */
    private WaitActivity wait;

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends participants down one of two paths in a
     * journey, based on conditions that you specify.
     * </p>
     * 
     * @param conditionalSplit
     *        The settings for a yes/no split activity. This type of activity sends participants down one of two paths
     *        in a journey, based on conditions that you specify.
     */

    public void setConditionalSplit(ConditionalSplitActivity conditionalSplit) {
        this.conditionalSplit = conditionalSplit;
    }

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends participants down one of two paths in a
     * journey, based on conditions that you specify.
     * </p>
     * 
     * @return The settings for a yes/no split activity. This type of activity sends participants down one of two paths
     *         in a journey, based on conditions that you specify.
     */

    public ConditionalSplitActivity getConditionalSplit() {
        return this.conditionalSplit;
    }

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends participants down one of two paths in a
     * journey, based on conditions that you specify.
     * </p>
     * 
     * @param conditionalSplit
     *        The settings for a yes/no split activity. This type of activity sends participants down one of two paths
     *        in a journey, based on conditions that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withConditionalSplit(ConditionalSplitActivity conditionalSplit) {
        setConditionalSplit(conditionalSplit);
        return this;
    }

    /**
     * <p>
     * The custom description of the activity.
     * </p>
     * 
     * @param description
     *        The custom description of the activity.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the activity.
     * </p>
     * 
     * @return The custom description of the activity.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the activity.
     * </p>
     * 
     * @param description
     *        The custom description of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email message to participants.
     * </p>
     * 
     * @param eMAIL
     *        The settings for an email activity. This type of activity sends an email message to participants.
     */

    public void setEMAIL(EmailMessageActivity eMAIL) {
        this.eMAIL = eMAIL;
    }

    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email message to participants.
     * </p>
     * 
     * @return The settings for an email activity. This type of activity sends an email message to participants.
     */

    public EmailMessageActivity getEMAIL() {
        return this.eMAIL;
    }

    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email message to participants.
     * </p>
     * 
     * @param eMAIL
     *        The settings for an email activity. This type of activity sends an email message to participants.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withEMAIL(EmailMessageActivity eMAIL) {
        setEMAIL(eMAIL);
        return this;
    }

    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a journey for a specified percentage of
     * participants.
     * </p>
     * 
     * @param holdout
     *        The settings for a holdout activity. This type of activity stops a journey for a specified percentage of
     *        participants.
     */

    public void setHoldout(HoldoutActivity holdout) {
        this.holdout = holdout;
    }

    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a journey for a specified percentage of
     * participants.
     * </p>
     * 
     * @return The settings for a holdout activity. This type of activity stops a journey for a specified percentage of
     *         participants.
     */

    public HoldoutActivity getHoldout() {
        return this.holdout;
    }

    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a journey for a specified percentage of
     * participants.
     * </p>
     * 
     * @param holdout
     *        The settings for a holdout activity. This type of activity stops a journey for a specified percentage of
     *        participants.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withHoldout(HoldoutActivity holdout) {
        setHoldout(holdout);
        return this;
    }

    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity sends participants down one of as many as
     * five paths (including a default <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     * 
     * @param multiCondition
     *        The settings for a multivariate split activity. This type of activity sends participants down one of as
     *        many as five paths (including a default <i>Else</i> path) in a journey, based on conditions that you
     *        specify.
     */

    public void setMultiCondition(MultiConditionalSplitActivity multiCondition) {
        this.multiCondition = multiCondition;
    }

    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity sends participants down one of as many as
     * five paths (including a default <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     * 
     * @return The settings for a multivariate split activity. This type of activity sends participants down one of as
     *         many as five paths (including a default <i>Else</i> path) in a journey, based on conditions that you
     *         specify.
     */

    public MultiConditionalSplitActivity getMultiCondition() {
        return this.multiCondition;
    }

    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity sends participants down one of as many as
     * five paths (including a default <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     * 
     * @param multiCondition
     *        The settings for a multivariate split activity. This type of activity sends participants down one of as
     *        many as five paths (including a default <i>Else</i> path) in a journey, based on conditions that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withMultiCondition(MultiConditionalSplitActivity multiCondition) {
        setMultiCondition(multiCondition);
        return this;
    }

    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly sends specified percentages of
     * participants down one of as many as five paths in a journey, based on conditions that you specify.
     * </p>
     * 
     * @param randomSplit
     *        The settings for a random split activity. This type of activity randomly sends specified percentages of
     *        participants down one of as many as five paths in a journey, based on conditions that you specify.
     */

    public void setRandomSplit(RandomSplitActivity randomSplit) {
        this.randomSplit = randomSplit;
    }

    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly sends specified percentages of
     * participants down one of as many as five paths in a journey, based on conditions that you specify.
     * </p>
     * 
     * @return The settings for a random split activity. This type of activity randomly sends specified percentages of
     *         participants down one of as many as five paths in a journey, based on conditions that you specify.
     */

    public RandomSplitActivity getRandomSplit() {
        return this.randomSplit;
    }

    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly sends specified percentages of
     * participants down one of as many as five paths in a journey, based on conditions that you specify.
     * </p>
     * 
     * @param randomSplit
     *        The settings for a random split activity. This type of activity randomly sends specified percentages of
     *        participants down one of as many as five paths in a journey, based on conditions that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withRandomSplit(RandomSplitActivity randomSplit) {
        setRandomSplit(randomSplit);
        return this;
    }

    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a certain amount of time or until a specific
     * date and time before moving participants to the next activity in a journey.
     * </p>
     * 
     * @param wait
     *        The settings for a wait activity. This type of activity waits for a certain amount of time or until a
     *        specific date and time before moving participants to the next activity in a journey.
     */

    public void setWait(WaitActivity wait) {
        this.wait = wait;
    }

    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a certain amount of time or until a specific
     * date and time before moving participants to the next activity in a journey.
     * </p>
     * 
     * @return The settings for a wait activity. This type of activity waits for a certain amount of time or until a
     *         specific date and time before moving participants to the next activity in a journey.
     */

    public WaitActivity getWait() {
        return this.wait;
    }

    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a certain amount of time or until a specific
     * date and time before moving participants to the next activity in a journey.
     * </p>
     * 
     * @param wait
     *        The settings for a wait activity. This type of activity waits for a certain amount of time or until a
     *        specific date and time before moving participants to the next activity in a journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withWait(WaitActivity wait) {
        setWait(wait);
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
        if (getConditionalSplit() != null)
            sb.append("ConditionalSplit: ").append(getConditionalSplit()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEMAIL() != null)
            sb.append("EMAIL: ").append(getEMAIL()).append(",");
        if (getHoldout() != null)
            sb.append("Holdout: ").append(getHoldout()).append(",");
        if (getMultiCondition() != null)
            sb.append("MultiCondition: ").append(getMultiCondition()).append(",");
        if (getRandomSplit() != null)
            sb.append("RandomSplit: ").append(getRandomSplit()).append(",");
        if (getWait() != null)
            sb.append("Wait: ").append(getWait());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Activity == false)
            return false;
        Activity other = (Activity) obj;
        if (other.getConditionalSplit() == null ^ this.getConditionalSplit() == null)
            return false;
        if (other.getConditionalSplit() != null && other.getConditionalSplit().equals(this.getConditionalSplit()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEMAIL() == null ^ this.getEMAIL() == null)
            return false;
        if (other.getEMAIL() != null && other.getEMAIL().equals(this.getEMAIL()) == false)
            return false;
        if (other.getHoldout() == null ^ this.getHoldout() == null)
            return false;
        if (other.getHoldout() != null && other.getHoldout().equals(this.getHoldout()) == false)
            return false;
        if (other.getMultiCondition() == null ^ this.getMultiCondition() == null)
            return false;
        if (other.getMultiCondition() != null && other.getMultiCondition().equals(this.getMultiCondition()) == false)
            return false;
        if (other.getRandomSplit() == null ^ this.getRandomSplit() == null)
            return false;
        if (other.getRandomSplit() != null && other.getRandomSplit().equals(this.getRandomSplit()) == false)
            return false;
        if (other.getWait() == null ^ this.getWait() == null)
            return false;
        if (other.getWait() != null && other.getWait().equals(this.getWait()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionalSplit() == null) ? 0 : getConditionalSplit().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        hashCode = prime * hashCode + ((getHoldout() == null) ? 0 : getHoldout().hashCode());
        hashCode = prime * hashCode + ((getMultiCondition() == null) ? 0 : getMultiCondition().hashCode());
        hashCode = prime * hashCode + ((getRandomSplit() == null) ? 0 : getRandomSplit().hashCode());
        hashCode = prime * hashCode + ((getWait() == null) ? 0 : getWait().hashCode());
        return hashCode;
    }

    @Override
    public Activity clone() {
        try {
            return (Activity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
