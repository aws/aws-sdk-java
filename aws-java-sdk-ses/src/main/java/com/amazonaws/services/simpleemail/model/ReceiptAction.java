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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An action that Amazon SES can take when it receives an email on behalf of one or more email addresses or domains that
 * you own. An instance of this data type can represent only one action.
 * </p>
 * <p>
 * For information about setting up receipt rules, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReceiptAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReceiptAction implements Serializable, Cloneable {

    /**
     * <p>
     * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a
     * notification to Amazon SNS.
     * </p>
     */
    private S3Action s3Action;
    /**
     * <p>
     * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification
     * to Amazon Simple Notification Service (Amazon SNS).
     * </p>
     */
    private BounceAction bounceAction;
    /**
     * <p>
     * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     * </p>
     */
    private WorkmailAction workmailAction;
    /**
     * <p>
     * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     * </p>
     */
    private LambdaAction lambdaAction;
    /**
     * <p>
     * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
     * </p>
     */
    private StopAction stopAction;
    /**
     * <p>
     * Adds a header to the received email.
     * </p>
     */
    private AddHeaderAction addHeaderAction;
    /**
     * <p>
     * Publishes the email content within a notification to Amazon SNS.
     * </p>
     */
    private SNSAction sNSAction;

    /**
     * <p>
     * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a
     * notification to Amazon SNS.
     * </p>
     * 
     * @param s3Action
     *        Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally,
     *        publishes a notification to Amazon SNS.
     */

    public void setS3Action(S3Action s3Action) {
        this.s3Action = s3Action;
    }

    /**
     * <p>
     * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a
     * notification to Amazon SNS.
     * </p>
     * 
     * @return Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally,
     *         publishes a notification to Amazon SNS.
     */

    public S3Action getS3Action() {
        return this.s3Action;
    }

    /**
     * <p>
     * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a
     * notification to Amazon SNS.
     * </p>
     * 
     * @param s3Action
     *        Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally,
     *        publishes a notification to Amazon SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptAction withS3Action(S3Action s3Action) {
        setS3Action(s3Action);
        return this;
    }

    /**
     * <p>
     * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification
     * to Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * 
     * @param bounceAction
     *        Rejects the received email by returning a bounce response to the sender and, optionally, publishes a
     *        notification to Amazon Simple Notification Service (Amazon SNS).
     */

    public void setBounceAction(BounceAction bounceAction) {
        this.bounceAction = bounceAction;
    }

    /**
     * <p>
     * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification
     * to Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * 
     * @return Rejects the received email by returning a bounce response to the sender and, optionally, publishes a
     *         notification to Amazon Simple Notification Service (Amazon SNS).
     */

    public BounceAction getBounceAction() {
        return this.bounceAction;
    }

    /**
     * <p>
     * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification
     * to Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * 
     * @param bounceAction
     *        Rejects the received email by returning a bounce response to the sender and, optionally, publishes a
     *        notification to Amazon Simple Notification Service (Amazon SNS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptAction withBounceAction(BounceAction bounceAction) {
        setBounceAction(bounceAction);
        return this;
    }

    /**
     * <p>
     * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     * </p>
     * 
     * @param workmailAction
     *        Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     */

    public void setWorkmailAction(WorkmailAction workmailAction) {
        this.workmailAction = workmailAction;
    }

    /**
     * <p>
     * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     * </p>
     * 
     * @return Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     */

    public WorkmailAction getWorkmailAction() {
        return this.workmailAction;
    }

    /**
     * <p>
     * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     * </p>
     * 
     * @param workmailAction
     *        Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptAction withWorkmailAction(WorkmailAction workmailAction) {
        setWorkmailAction(workmailAction);
        return this;
    }

    /**
     * <p>
     * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     * </p>
     * 
     * @param lambdaAction
     *        Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     */

    public void setLambdaAction(LambdaAction lambdaAction) {
        this.lambdaAction = lambdaAction;
    }

    /**
     * <p>
     * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     * </p>
     * 
     * @return Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     */

    public LambdaAction getLambdaAction() {
        return this.lambdaAction;
    }

    /**
     * <p>
     * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     * </p>
     * 
     * @param lambdaAction
     *        Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptAction withLambdaAction(LambdaAction lambdaAction) {
        setLambdaAction(lambdaAction);
        return this;
    }

    /**
     * <p>
     * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
     * </p>
     * 
     * @param stopAction
     *        Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
     */

    public void setStopAction(StopAction stopAction) {
        this.stopAction = stopAction;
    }

    /**
     * <p>
     * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
     * </p>
     * 
     * @return Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
     */

    public StopAction getStopAction() {
        return this.stopAction;
    }

    /**
     * <p>
     * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
     * </p>
     * 
     * @param stopAction
     *        Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptAction withStopAction(StopAction stopAction) {
        setStopAction(stopAction);
        return this;
    }

    /**
     * <p>
     * Adds a header to the received email.
     * </p>
     * 
     * @param addHeaderAction
     *        Adds a header to the received email.
     */

    public void setAddHeaderAction(AddHeaderAction addHeaderAction) {
        this.addHeaderAction = addHeaderAction;
    }

    /**
     * <p>
     * Adds a header to the received email.
     * </p>
     * 
     * @return Adds a header to the received email.
     */

    public AddHeaderAction getAddHeaderAction() {
        return this.addHeaderAction;
    }

    /**
     * <p>
     * Adds a header to the received email.
     * </p>
     * 
     * @param addHeaderAction
     *        Adds a header to the received email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptAction withAddHeaderAction(AddHeaderAction addHeaderAction) {
        setAddHeaderAction(addHeaderAction);
        return this;
    }

    /**
     * <p>
     * Publishes the email content within a notification to Amazon SNS.
     * </p>
     * 
     * @param sNSAction
     *        Publishes the email content within a notification to Amazon SNS.
     */

    public void setSNSAction(SNSAction sNSAction) {
        this.sNSAction = sNSAction;
    }

    /**
     * <p>
     * Publishes the email content within a notification to Amazon SNS.
     * </p>
     * 
     * @return Publishes the email content within a notification to Amazon SNS.
     */

    public SNSAction getSNSAction() {
        return this.sNSAction;
    }

    /**
     * <p>
     * Publishes the email content within a notification to Amazon SNS.
     * </p>
     * 
     * @param sNSAction
     *        Publishes the email content within a notification to Amazon SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptAction withSNSAction(SNSAction sNSAction) {
        setSNSAction(sNSAction);
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
        if (getS3Action() != null)
            sb.append("S3Action: ").append(getS3Action()).append(",");
        if (getBounceAction() != null)
            sb.append("BounceAction: ").append(getBounceAction()).append(",");
        if (getWorkmailAction() != null)
            sb.append("WorkmailAction: ").append(getWorkmailAction()).append(",");
        if (getLambdaAction() != null)
            sb.append("LambdaAction: ").append(getLambdaAction()).append(",");
        if (getStopAction() != null)
            sb.append("StopAction: ").append(getStopAction()).append(",");
        if (getAddHeaderAction() != null)
            sb.append("AddHeaderAction: ").append(getAddHeaderAction()).append(",");
        if (getSNSAction() != null)
            sb.append("SNSAction: ").append(getSNSAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiptAction == false)
            return false;
        ReceiptAction other = (ReceiptAction) obj;
        if (other.getS3Action() == null ^ this.getS3Action() == null)
            return false;
        if (other.getS3Action() != null && other.getS3Action().equals(this.getS3Action()) == false)
            return false;
        if (other.getBounceAction() == null ^ this.getBounceAction() == null)
            return false;
        if (other.getBounceAction() != null && other.getBounceAction().equals(this.getBounceAction()) == false)
            return false;
        if (other.getWorkmailAction() == null ^ this.getWorkmailAction() == null)
            return false;
        if (other.getWorkmailAction() != null && other.getWorkmailAction().equals(this.getWorkmailAction()) == false)
            return false;
        if (other.getLambdaAction() == null ^ this.getLambdaAction() == null)
            return false;
        if (other.getLambdaAction() != null && other.getLambdaAction().equals(this.getLambdaAction()) == false)
            return false;
        if (other.getStopAction() == null ^ this.getStopAction() == null)
            return false;
        if (other.getStopAction() != null && other.getStopAction().equals(this.getStopAction()) == false)
            return false;
        if (other.getAddHeaderAction() == null ^ this.getAddHeaderAction() == null)
            return false;
        if (other.getAddHeaderAction() != null && other.getAddHeaderAction().equals(this.getAddHeaderAction()) == false)
            return false;
        if (other.getSNSAction() == null ^ this.getSNSAction() == null)
            return false;
        if (other.getSNSAction() != null && other.getSNSAction().equals(this.getSNSAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Action() == null) ? 0 : getS3Action().hashCode());
        hashCode = prime * hashCode + ((getBounceAction() == null) ? 0 : getBounceAction().hashCode());
        hashCode = prime * hashCode + ((getWorkmailAction() == null) ? 0 : getWorkmailAction().hashCode());
        hashCode = prime * hashCode + ((getLambdaAction() == null) ? 0 : getLambdaAction().hashCode());
        hashCode = prime * hashCode + ((getStopAction() == null) ? 0 : getStopAction().hashCode());
        hashCode = prime * hashCode + ((getAddHeaderAction() == null) ? 0 : getAddHeaderAction().hashCode());
        hashCode = prime * hashCode + ((getSNSAction() == null) ? 0 : getSNSAction().hashCode());
        return hashCode;
    }

    @Override
    public ReceiptAction clone() {
        try {
            return (ReceiptAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
