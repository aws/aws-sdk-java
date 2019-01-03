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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An activity that performs a transformation on a message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/PipelineActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the source of the messages to be processed.
     * </p>
     */
    private ChannelActivity channel;
    /**
     * <p>
     * Runs a Lambda function to modify the message.
     * </p>
     */
    private LambdaActivity lambda;
    /**
     * <p>
     * Specifies where to store the processed message data.
     * </p>
     */
    private DatastoreActivity datastore;
    /**
     * <p>
     * Adds other attributes based on existing attributes in the message.
     * </p>
     */
    private AddAttributesActivity addAttributes;
    /**
     * <p>
     * Removes attributes from a message.
     * </p>
     */
    private RemoveAttributesActivity removeAttributes;
    /**
     * <p>
     * Creates a new message using only the specified attributes from the original message.
     * </p>
     */
    private SelectAttributesActivity selectAttributes;
    /**
     * <p>
     * Filters a message based on its attributes.
     * </p>
     */
    private FilterActivity filter;
    /**
     * <p>
     * Computes an arithmetic expression using the message's attributes and adds it to the message.
     * </p>
     */
    private MathActivity math;
    /**
     * <p>
     * Adds data from the AWS IoT device registry to your message.
     * </p>
     */
    private DeviceRegistryEnrichActivity deviceRegistryEnrich;
    /**
     * <p>
     * Adds information from the AWS IoT Device Shadows service to a message.
     * </p>
     */
    private DeviceShadowEnrichActivity deviceShadowEnrich;

    /**
     * <p>
     * Determines the source of the messages to be processed.
     * </p>
     * 
     * @param channel
     *        Determines the source of the messages to be processed.
     */

    public void setChannel(ChannelActivity channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * Determines the source of the messages to be processed.
     * </p>
     * 
     * @return Determines the source of the messages to be processed.
     */

    public ChannelActivity getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * Determines the source of the messages to be processed.
     * </p>
     * 
     * @param channel
     *        Determines the source of the messages to be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withChannel(ChannelActivity channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * Runs a Lambda function to modify the message.
     * </p>
     * 
     * @param lambda
     *        Runs a Lambda function to modify the message.
     */

    public void setLambda(LambdaActivity lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Runs a Lambda function to modify the message.
     * </p>
     * 
     * @return Runs a Lambda function to modify the message.
     */

    public LambdaActivity getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * Runs a Lambda function to modify the message.
     * </p>
     * 
     * @param lambda
     *        Runs a Lambda function to modify the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withLambda(LambdaActivity lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * Specifies where to store the processed message data.
     * </p>
     * 
     * @param datastore
     *        Specifies where to store the processed message data.
     */

    public void setDatastore(DatastoreActivity datastore) {
        this.datastore = datastore;
    }

    /**
     * <p>
     * Specifies where to store the processed message data.
     * </p>
     * 
     * @return Specifies where to store the processed message data.
     */

    public DatastoreActivity getDatastore() {
        return this.datastore;
    }

    /**
     * <p>
     * Specifies where to store the processed message data.
     * </p>
     * 
     * @param datastore
     *        Specifies where to store the processed message data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withDatastore(DatastoreActivity datastore) {
        setDatastore(datastore);
        return this;
    }

    /**
     * <p>
     * Adds other attributes based on existing attributes in the message.
     * </p>
     * 
     * @param addAttributes
     *        Adds other attributes based on existing attributes in the message.
     */

    public void setAddAttributes(AddAttributesActivity addAttributes) {
        this.addAttributes = addAttributes;
    }

    /**
     * <p>
     * Adds other attributes based on existing attributes in the message.
     * </p>
     * 
     * @return Adds other attributes based on existing attributes in the message.
     */

    public AddAttributesActivity getAddAttributes() {
        return this.addAttributes;
    }

    /**
     * <p>
     * Adds other attributes based on existing attributes in the message.
     * </p>
     * 
     * @param addAttributes
     *        Adds other attributes based on existing attributes in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withAddAttributes(AddAttributesActivity addAttributes) {
        setAddAttributes(addAttributes);
        return this;
    }

    /**
     * <p>
     * Removes attributes from a message.
     * </p>
     * 
     * @param removeAttributes
     *        Removes attributes from a message.
     */

    public void setRemoveAttributes(RemoveAttributesActivity removeAttributes) {
        this.removeAttributes = removeAttributes;
    }

    /**
     * <p>
     * Removes attributes from a message.
     * </p>
     * 
     * @return Removes attributes from a message.
     */

    public RemoveAttributesActivity getRemoveAttributes() {
        return this.removeAttributes;
    }

    /**
     * <p>
     * Removes attributes from a message.
     * </p>
     * 
     * @param removeAttributes
     *        Removes attributes from a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withRemoveAttributes(RemoveAttributesActivity removeAttributes) {
        setRemoveAttributes(removeAttributes);
        return this;
    }

    /**
     * <p>
     * Creates a new message using only the specified attributes from the original message.
     * </p>
     * 
     * @param selectAttributes
     *        Creates a new message using only the specified attributes from the original message.
     */

    public void setSelectAttributes(SelectAttributesActivity selectAttributes) {
        this.selectAttributes = selectAttributes;
    }

    /**
     * <p>
     * Creates a new message using only the specified attributes from the original message.
     * </p>
     * 
     * @return Creates a new message using only the specified attributes from the original message.
     */

    public SelectAttributesActivity getSelectAttributes() {
        return this.selectAttributes;
    }

    /**
     * <p>
     * Creates a new message using only the specified attributes from the original message.
     * </p>
     * 
     * @param selectAttributes
     *        Creates a new message using only the specified attributes from the original message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withSelectAttributes(SelectAttributesActivity selectAttributes) {
        setSelectAttributes(selectAttributes);
        return this;
    }

    /**
     * <p>
     * Filters a message based on its attributes.
     * </p>
     * 
     * @param filter
     *        Filters a message based on its attributes.
     */

    public void setFilter(FilterActivity filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters a message based on its attributes.
     * </p>
     * 
     * @return Filters a message based on its attributes.
     */

    public FilterActivity getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters a message based on its attributes.
     * </p>
     * 
     * @param filter
     *        Filters a message based on its attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withFilter(FilterActivity filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Computes an arithmetic expression using the message's attributes and adds it to the message.
     * </p>
     * 
     * @param math
     *        Computes an arithmetic expression using the message's attributes and adds it to the message.
     */

    public void setMath(MathActivity math) {
        this.math = math;
    }

    /**
     * <p>
     * Computes an arithmetic expression using the message's attributes and adds it to the message.
     * </p>
     * 
     * @return Computes an arithmetic expression using the message's attributes and adds it to the message.
     */

    public MathActivity getMath() {
        return this.math;
    }

    /**
     * <p>
     * Computes an arithmetic expression using the message's attributes and adds it to the message.
     * </p>
     * 
     * @param math
     *        Computes an arithmetic expression using the message's attributes and adds it to the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withMath(MathActivity math) {
        setMath(math);
        return this;
    }

    /**
     * <p>
     * Adds data from the AWS IoT device registry to your message.
     * </p>
     * 
     * @param deviceRegistryEnrich
     *        Adds data from the AWS IoT device registry to your message.
     */

    public void setDeviceRegistryEnrich(DeviceRegistryEnrichActivity deviceRegistryEnrich) {
        this.deviceRegistryEnrich = deviceRegistryEnrich;
    }

    /**
     * <p>
     * Adds data from the AWS IoT device registry to your message.
     * </p>
     * 
     * @return Adds data from the AWS IoT device registry to your message.
     */

    public DeviceRegistryEnrichActivity getDeviceRegistryEnrich() {
        return this.deviceRegistryEnrich;
    }

    /**
     * <p>
     * Adds data from the AWS IoT device registry to your message.
     * </p>
     * 
     * @param deviceRegistryEnrich
     *        Adds data from the AWS IoT device registry to your message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withDeviceRegistryEnrich(DeviceRegistryEnrichActivity deviceRegistryEnrich) {
        setDeviceRegistryEnrich(deviceRegistryEnrich);
        return this;
    }

    /**
     * <p>
     * Adds information from the AWS IoT Device Shadows service to a message.
     * </p>
     * 
     * @param deviceShadowEnrich
     *        Adds information from the AWS IoT Device Shadows service to a message.
     */

    public void setDeviceShadowEnrich(DeviceShadowEnrichActivity deviceShadowEnrich) {
        this.deviceShadowEnrich = deviceShadowEnrich;
    }

    /**
     * <p>
     * Adds information from the AWS IoT Device Shadows service to a message.
     * </p>
     * 
     * @return Adds information from the AWS IoT Device Shadows service to a message.
     */

    public DeviceShadowEnrichActivity getDeviceShadowEnrich() {
        return this.deviceShadowEnrich;
    }

    /**
     * <p>
     * Adds information from the AWS IoT Device Shadows service to a message.
     * </p>
     * 
     * @param deviceShadowEnrich
     *        Adds information from the AWS IoT Device Shadows service to a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineActivity withDeviceShadowEnrich(DeviceShadowEnrichActivity deviceShadowEnrich) {
        setDeviceShadowEnrich(deviceShadowEnrich);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda()).append(",");
        if (getDatastore() != null)
            sb.append("Datastore: ").append(getDatastore()).append(",");
        if (getAddAttributes() != null)
            sb.append("AddAttributes: ").append(getAddAttributes()).append(",");
        if (getRemoveAttributes() != null)
            sb.append("RemoveAttributes: ").append(getRemoveAttributes()).append(",");
        if (getSelectAttributes() != null)
            sb.append("SelectAttributes: ").append(getSelectAttributes()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMath() != null)
            sb.append("Math: ").append(getMath()).append(",");
        if (getDeviceRegistryEnrich() != null)
            sb.append("DeviceRegistryEnrich: ").append(getDeviceRegistryEnrich()).append(",");
        if (getDeviceShadowEnrich() != null)
            sb.append("DeviceShadowEnrich: ").append(getDeviceShadowEnrich());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineActivity == false)
            return false;
        PipelineActivity other = (PipelineActivity) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getDatastore() == null ^ this.getDatastore() == null)
            return false;
        if (other.getDatastore() != null && other.getDatastore().equals(this.getDatastore()) == false)
            return false;
        if (other.getAddAttributes() == null ^ this.getAddAttributes() == null)
            return false;
        if (other.getAddAttributes() != null && other.getAddAttributes().equals(this.getAddAttributes()) == false)
            return false;
        if (other.getRemoveAttributes() == null ^ this.getRemoveAttributes() == null)
            return false;
        if (other.getRemoveAttributes() != null && other.getRemoveAttributes().equals(this.getRemoveAttributes()) == false)
            return false;
        if (other.getSelectAttributes() == null ^ this.getSelectAttributes() == null)
            return false;
        if (other.getSelectAttributes() != null && other.getSelectAttributes().equals(this.getSelectAttributes()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMath() == null ^ this.getMath() == null)
            return false;
        if (other.getMath() != null && other.getMath().equals(this.getMath()) == false)
            return false;
        if (other.getDeviceRegistryEnrich() == null ^ this.getDeviceRegistryEnrich() == null)
            return false;
        if (other.getDeviceRegistryEnrich() != null && other.getDeviceRegistryEnrich().equals(this.getDeviceRegistryEnrich()) == false)
            return false;
        if (other.getDeviceShadowEnrich() == null ^ this.getDeviceShadowEnrich() == null)
            return false;
        if (other.getDeviceShadowEnrich() != null && other.getDeviceShadowEnrich().equals(this.getDeviceShadowEnrich()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getDatastore() == null) ? 0 : getDatastore().hashCode());
        hashCode = prime * hashCode + ((getAddAttributes() == null) ? 0 : getAddAttributes().hashCode());
        hashCode = prime * hashCode + ((getRemoveAttributes() == null) ? 0 : getRemoveAttributes().hashCode());
        hashCode = prime * hashCode + ((getSelectAttributes() == null) ? 0 : getSelectAttributes().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMath() == null) ? 0 : getMath().hashCode());
        hashCode = prime * hashCode + ((getDeviceRegistryEnrich() == null) ? 0 : getDeviceRegistryEnrich().hashCode());
        hashCode = prime * hashCode + ((getDeviceShadowEnrich() == null) ? 0 : getDeviceShadowEnrich().hashCode());
        return hashCode;
    }

    @Override
    public PipelineActivity clone() {
        try {
            return (PipelineActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.PipelineActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
