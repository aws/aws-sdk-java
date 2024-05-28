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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action for a rule to take. Only one of the contained actions can be set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This action adds a header. This can be used to add arbitrary email headers.
     * </p>
     */
    private AddHeaderAction addHeader;
    /**
     * <p>
     * This action archives the email. This can be used to deliver an email to an archive.
     * </p>
     */
    private ArchiveAction archive;
    /**
     * <p>
     * This action delivers an email to a WorkMail mailbox.
     * </p>
     */
    private DeliverToMailboxAction deliverToMailbox;
    /**
     * <p>
     * This action terminates the evaluation of rules in the rule set.
     * </p>
     */
    private DropAction drop;
    /**
     * <p>
     * This action relays the email to another SMTP server.
     * </p>
     */
    private RelayAction relay;
    /**
     * <p>
     * The action replaces certain or all recipients with a different set of recipients.
     * </p>
     */
    private ReplaceRecipientAction replaceRecipient;
    /**
     * <p>
     * This action sends the email to the internet.
     * </p>
     */
    private SendAction send;
    /**
     * <p>
     * This action writes the MIME content of the email to an S3 bucket.
     * </p>
     */
    private S3Action writeToS3;

    /**
     * <p>
     * This action adds a header. This can be used to add arbitrary email headers.
     * </p>
     * 
     * @param addHeader
     *        This action adds a header. This can be used to add arbitrary email headers.
     */

    public void setAddHeader(AddHeaderAction addHeader) {
        this.addHeader = addHeader;
    }

    /**
     * <p>
     * This action adds a header. This can be used to add arbitrary email headers.
     * </p>
     * 
     * @return This action adds a header. This can be used to add arbitrary email headers.
     */

    public AddHeaderAction getAddHeader() {
        return this.addHeader;
    }

    /**
     * <p>
     * This action adds a header. This can be used to add arbitrary email headers.
     * </p>
     * 
     * @param addHeader
     *        This action adds a header. This can be used to add arbitrary email headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withAddHeader(AddHeaderAction addHeader) {
        setAddHeader(addHeader);
        return this;
    }

    /**
     * <p>
     * This action archives the email. This can be used to deliver an email to an archive.
     * </p>
     * 
     * @param archive
     *        This action archives the email. This can be used to deliver an email to an archive.
     */

    public void setArchive(ArchiveAction archive) {
        this.archive = archive;
    }

    /**
     * <p>
     * This action archives the email. This can be used to deliver an email to an archive.
     * </p>
     * 
     * @return This action archives the email. This can be used to deliver an email to an archive.
     */

    public ArchiveAction getArchive() {
        return this.archive;
    }

    /**
     * <p>
     * This action archives the email. This can be used to deliver an email to an archive.
     * </p>
     * 
     * @param archive
     *        This action archives the email. This can be used to deliver an email to an archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withArchive(ArchiveAction archive) {
        setArchive(archive);
        return this;
    }

    /**
     * <p>
     * This action delivers an email to a WorkMail mailbox.
     * </p>
     * 
     * @param deliverToMailbox
     *        This action delivers an email to a WorkMail mailbox.
     */

    public void setDeliverToMailbox(DeliverToMailboxAction deliverToMailbox) {
        this.deliverToMailbox = deliverToMailbox;
    }

    /**
     * <p>
     * This action delivers an email to a WorkMail mailbox.
     * </p>
     * 
     * @return This action delivers an email to a WorkMail mailbox.
     */

    public DeliverToMailboxAction getDeliverToMailbox() {
        return this.deliverToMailbox;
    }

    /**
     * <p>
     * This action delivers an email to a WorkMail mailbox.
     * </p>
     * 
     * @param deliverToMailbox
     *        This action delivers an email to a WorkMail mailbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withDeliverToMailbox(DeliverToMailboxAction deliverToMailbox) {
        setDeliverToMailbox(deliverToMailbox);
        return this;
    }

    /**
     * <p>
     * This action terminates the evaluation of rules in the rule set.
     * </p>
     * 
     * @param drop
     *        This action terminates the evaluation of rules in the rule set.
     */

    public void setDrop(DropAction drop) {
        this.drop = drop;
    }

    /**
     * <p>
     * This action terminates the evaluation of rules in the rule set.
     * </p>
     * 
     * @return This action terminates the evaluation of rules in the rule set.
     */

    public DropAction getDrop() {
        return this.drop;
    }

    /**
     * <p>
     * This action terminates the evaluation of rules in the rule set.
     * </p>
     * 
     * @param drop
     *        This action terminates the evaluation of rules in the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withDrop(DropAction drop) {
        setDrop(drop);
        return this;
    }

    /**
     * <p>
     * This action relays the email to another SMTP server.
     * </p>
     * 
     * @param relay
     *        This action relays the email to another SMTP server.
     */

    public void setRelay(RelayAction relay) {
        this.relay = relay;
    }

    /**
     * <p>
     * This action relays the email to another SMTP server.
     * </p>
     * 
     * @return This action relays the email to another SMTP server.
     */

    public RelayAction getRelay() {
        return this.relay;
    }

    /**
     * <p>
     * This action relays the email to another SMTP server.
     * </p>
     * 
     * @param relay
     *        This action relays the email to another SMTP server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withRelay(RelayAction relay) {
        setRelay(relay);
        return this;
    }

    /**
     * <p>
     * The action replaces certain or all recipients with a different set of recipients.
     * </p>
     * 
     * @param replaceRecipient
     *        The action replaces certain or all recipients with a different set of recipients.
     */

    public void setReplaceRecipient(ReplaceRecipientAction replaceRecipient) {
        this.replaceRecipient = replaceRecipient;
    }

    /**
     * <p>
     * The action replaces certain or all recipients with a different set of recipients.
     * </p>
     * 
     * @return The action replaces certain or all recipients with a different set of recipients.
     */

    public ReplaceRecipientAction getReplaceRecipient() {
        return this.replaceRecipient;
    }

    /**
     * <p>
     * The action replaces certain or all recipients with a different set of recipients.
     * </p>
     * 
     * @param replaceRecipient
     *        The action replaces certain or all recipients with a different set of recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withReplaceRecipient(ReplaceRecipientAction replaceRecipient) {
        setReplaceRecipient(replaceRecipient);
        return this;
    }

    /**
     * <p>
     * This action sends the email to the internet.
     * </p>
     * 
     * @param send
     *        This action sends the email to the internet.
     */

    public void setSend(SendAction send) {
        this.send = send;
    }

    /**
     * <p>
     * This action sends the email to the internet.
     * </p>
     * 
     * @return This action sends the email to the internet.
     */

    public SendAction getSend() {
        return this.send;
    }

    /**
     * <p>
     * This action sends the email to the internet.
     * </p>
     * 
     * @param send
     *        This action sends the email to the internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withSend(SendAction send) {
        setSend(send);
        return this;
    }

    /**
     * <p>
     * This action writes the MIME content of the email to an S3 bucket.
     * </p>
     * 
     * @param writeToS3
     *        This action writes the MIME content of the email to an S3 bucket.
     */

    public void setWriteToS3(S3Action writeToS3) {
        this.writeToS3 = writeToS3;
    }

    /**
     * <p>
     * This action writes the MIME content of the email to an S3 bucket.
     * </p>
     * 
     * @return This action writes the MIME content of the email to an S3 bucket.
     */

    public S3Action getWriteToS3() {
        return this.writeToS3;
    }

    /**
     * <p>
     * This action writes the MIME content of the email to an S3 bucket.
     * </p>
     * 
     * @param writeToS3
     *        This action writes the MIME content of the email to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withWriteToS3(S3Action writeToS3) {
        setWriteToS3(writeToS3);
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
        if (getAddHeader() != null)
            sb.append("AddHeader: ").append(getAddHeader()).append(",");
        if (getArchive() != null)
            sb.append("Archive: ").append(getArchive()).append(",");
        if (getDeliverToMailbox() != null)
            sb.append("DeliverToMailbox: ").append(getDeliverToMailbox()).append(",");
        if (getDrop() != null)
            sb.append("Drop: ").append(getDrop()).append(",");
        if (getRelay() != null)
            sb.append("Relay: ").append(getRelay()).append(",");
        if (getReplaceRecipient() != null)
            sb.append("ReplaceRecipient: ").append(getReplaceRecipient()).append(",");
        if (getSend() != null)
            sb.append("Send: ").append(getSend()).append(",");
        if (getWriteToS3() != null)
            sb.append("WriteToS3: ").append(getWriteToS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleAction == false)
            return false;
        RuleAction other = (RuleAction) obj;
        if (other.getAddHeader() == null ^ this.getAddHeader() == null)
            return false;
        if (other.getAddHeader() != null && other.getAddHeader().equals(this.getAddHeader()) == false)
            return false;
        if (other.getArchive() == null ^ this.getArchive() == null)
            return false;
        if (other.getArchive() != null && other.getArchive().equals(this.getArchive()) == false)
            return false;
        if (other.getDeliverToMailbox() == null ^ this.getDeliverToMailbox() == null)
            return false;
        if (other.getDeliverToMailbox() != null && other.getDeliverToMailbox().equals(this.getDeliverToMailbox()) == false)
            return false;
        if (other.getDrop() == null ^ this.getDrop() == null)
            return false;
        if (other.getDrop() != null && other.getDrop().equals(this.getDrop()) == false)
            return false;
        if (other.getRelay() == null ^ this.getRelay() == null)
            return false;
        if (other.getRelay() != null && other.getRelay().equals(this.getRelay()) == false)
            return false;
        if (other.getReplaceRecipient() == null ^ this.getReplaceRecipient() == null)
            return false;
        if (other.getReplaceRecipient() != null && other.getReplaceRecipient().equals(this.getReplaceRecipient()) == false)
            return false;
        if (other.getSend() == null ^ this.getSend() == null)
            return false;
        if (other.getSend() != null && other.getSend().equals(this.getSend()) == false)
            return false;
        if (other.getWriteToS3() == null ^ this.getWriteToS3() == null)
            return false;
        if (other.getWriteToS3() != null && other.getWriteToS3().equals(this.getWriteToS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddHeader() == null) ? 0 : getAddHeader().hashCode());
        hashCode = prime * hashCode + ((getArchive() == null) ? 0 : getArchive().hashCode());
        hashCode = prime * hashCode + ((getDeliverToMailbox() == null) ? 0 : getDeliverToMailbox().hashCode());
        hashCode = prime * hashCode + ((getDrop() == null) ? 0 : getDrop().hashCode());
        hashCode = prime * hashCode + ((getRelay() == null) ? 0 : getRelay().hashCode());
        hashCode = prime * hashCode + ((getReplaceRecipient() == null) ? 0 : getReplaceRecipient().hashCode());
        hashCode = prime * hashCode + ((getSend() == null) ? 0 : getSend().hashCode());
        hashCode = prime * hashCode + ((getWriteToS3() == null) ? 0 : getWriteToS3().hashCode());
        return hashCode;
    }

    @Override
    public RuleAction clone() {
        try {
            return (RuleAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
