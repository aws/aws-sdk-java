/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Ad break configuration parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AdBreak" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdBreak implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall within
     * 100ms of a segment boundary, otherwise the ad break will be skipped.
     * </p>
     */
    private Long offsetMillis;
    /**
     * <p>
     * Ad break slate configuration.
     * </p>
     */
    private SlateSource slate;
    /**
     * <p>
     * This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using
     * splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
     * </p>
     */
    private SpliceInsertMessage spliceInsertMessage;

    /**
     * <p>
     * The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * </p>
     * 
     * @param messageType
     *        The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * </p>
     * 
     * @return The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * </p>
     * 
     * @param messageType
     *        The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public AdBreak withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * </p>
     * 
     * @param messageType
     *        The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public AdBreak withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall within
     * 100ms of a segment boundary, otherwise the ad break will be skipped.
     * </p>
     * 
     * @param offsetMillis
     *        How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall
     *        within 100ms of a segment boundary, otherwise the ad break will be skipped.
     */

    public void setOffsetMillis(Long offsetMillis) {
        this.offsetMillis = offsetMillis;
    }

    /**
     * <p>
     * How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall within
     * 100ms of a segment boundary, otherwise the ad break will be skipped.
     * </p>
     * 
     * @return How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall
     *         within 100ms of a segment boundary, otherwise the ad break will be skipped.
     */

    public Long getOffsetMillis() {
        return this.offsetMillis;
    }

    /**
     * <p>
     * How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall within
     * 100ms of a segment boundary, otherwise the ad break will be skipped.
     * </p>
     * 
     * @param offsetMillis
     *        How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall
     *        within 100ms of a segment boundary, otherwise the ad break will be skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdBreak withOffsetMillis(Long offsetMillis) {
        setOffsetMillis(offsetMillis);
        return this;
    }

    /**
     * <p>
     * Ad break slate configuration.
     * </p>
     * 
     * @param slate
     *        Ad break slate configuration.
     */

    public void setSlate(SlateSource slate) {
        this.slate = slate;
    }

    /**
     * <p>
     * Ad break slate configuration.
     * </p>
     * 
     * @return Ad break slate configuration.
     */

    public SlateSource getSlate() {
        return this.slate;
    }

    /**
     * <p>
     * Ad break slate configuration.
     * </p>
     * 
     * @param slate
     *        Ad break slate configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdBreak withSlate(SlateSource slate) {
        setSlate(slate);
        return this;
    }

    /**
     * <p>
     * This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using
     * splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
     * </p>
     * 
     * @param spliceInsertMessage
     *        This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using
     *        splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
     */

    public void setSpliceInsertMessage(SpliceInsertMessage spliceInsertMessage) {
        this.spliceInsertMessage = spliceInsertMessage;
    }

    /**
     * <p>
     * This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using
     * splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
     * </p>
     * 
     * @return This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using
     *         splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
     */

    public SpliceInsertMessage getSpliceInsertMessage() {
        return this.spliceInsertMessage;
    }

    /**
     * <p>
     * This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using
     * splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
     * </p>
     * 
     * @param spliceInsertMessage
     *        This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using
     *        splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdBreak withSpliceInsertMessage(SpliceInsertMessage spliceInsertMessage) {
        setSpliceInsertMessage(spliceInsertMessage);
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
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getOffsetMillis() != null)
            sb.append("OffsetMillis: ").append(getOffsetMillis()).append(",");
        if (getSlate() != null)
            sb.append("Slate: ").append(getSlate()).append(",");
        if (getSpliceInsertMessage() != null)
            sb.append("SpliceInsertMessage: ").append(getSpliceInsertMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdBreak == false)
            return false;
        AdBreak other = (AdBreak) obj;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getOffsetMillis() == null ^ this.getOffsetMillis() == null)
            return false;
        if (other.getOffsetMillis() != null && other.getOffsetMillis().equals(this.getOffsetMillis()) == false)
            return false;
        if (other.getSlate() == null ^ this.getSlate() == null)
            return false;
        if (other.getSlate() != null && other.getSlate().equals(this.getSlate()) == false)
            return false;
        if (other.getSpliceInsertMessage() == null ^ this.getSpliceInsertMessage() == null)
            return false;
        if (other.getSpliceInsertMessage() != null && other.getSpliceInsertMessage().equals(this.getSpliceInsertMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getOffsetMillis() == null) ? 0 : getOffsetMillis().hashCode());
        hashCode = prime * hashCode + ((getSlate() == null) ? 0 : getSlate().hashCode());
        hashCode = prime * hashCode + ((getSpliceInsertMessage() == null) ? 0 : getSpliceInsertMessage().hashCode());
        return hashCode;
    }

    @Override
    public AdBreak clone() {
        try {
            return (AdBreak) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AdBreakMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
