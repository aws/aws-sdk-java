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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/StartAssessmentFrameworkShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAssessmentFrameworkShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the custom framework to be shared.
     * </p>
     */
    private String frameworkId;
    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     */
    private String destinationAccount;
    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The unique identifier for the custom framework to be shared.
     * </p>
     * 
     * @param frameworkId
     *        The unique identifier for the custom framework to be shared.
     */

    public void setFrameworkId(String frameworkId) {
        this.frameworkId = frameworkId;
    }

    /**
     * <p>
     * The unique identifier for the custom framework to be shared.
     * </p>
     * 
     * @return The unique identifier for the custom framework to be shared.
     */

    public String getFrameworkId() {
        return this.frameworkId;
    }

    /**
     * <p>
     * The unique identifier for the custom framework to be shared.
     * </p>
     * 
     * @param frameworkId
     *        The unique identifier for the custom framework to be shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssessmentFrameworkShareRequest withFrameworkId(String frameworkId) {
        setFrameworkId(frameworkId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     * 
     * @param destinationAccount
     *        The Amazon Web Services account of the recipient.
     */

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     * 
     * @return The Amazon Web Services account of the recipient.
     */

    public String getDestinationAccount() {
        return this.destinationAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     * 
     * @param destinationAccount
     *        The Amazon Web Services account of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssessmentFrameworkShareRequest withDestinationAccount(String destinationAccount) {
        setDestinationAccount(destinationAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     * 
     * @param destinationRegion
     *        The Amazon Web Services Region of the recipient.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     * 
     * @return The Amazon Web Services Region of the recipient.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     * 
     * @param destinationRegion
     *        The Amazon Web Services Region of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssessmentFrameworkShareRequest withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     * 
     * @param comment
     *        An optional comment from the sender about the share request.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     * 
     * @return An optional comment from the sender about the share request.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     * 
     * @param comment
     *        An optional comment from the sender about the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssessmentFrameworkShareRequest withComment(String comment) {
        setComment(comment);
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
        if (getFrameworkId() != null)
            sb.append("FrameworkId: ").append(getFrameworkId()).append(",");
        if (getDestinationAccount() != null)
            sb.append("DestinationAccount: ").append(getDestinationAccount()).append(",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: ").append(getDestinationRegion()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAssessmentFrameworkShareRequest == false)
            return false;
        StartAssessmentFrameworkShareRequest other = (StartAssessmentFrameworkShareRequest) obj;
        if (other.getFrameworkId() == null ^ this.getFrameworkId() == null)
            return false;
        if (other.getFrameworkId() != null && other.getFrameworkId().equals(this.getFrameworkId()) == false)
            return false;
        if (other.getDestinationAccount() == null ^ this.getDestinationAccount() == null)
            return false;
        if (other.getDestinationAccount() != null && other.getDestinationAccount().equals(this.getDestinationAccount()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameworkId() == null) ? 0 : getFrameworkId().hashCode());
        hashCode = prime * hashCode + ((getDestinationAccount() == null) ? 0 : getDestinationAccount().hashCode());
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public StartAssessmentFrameworkShareRequest clone() {
        return (StartAssessmentFrameworkShareRequest) super.clone();
    }

}
