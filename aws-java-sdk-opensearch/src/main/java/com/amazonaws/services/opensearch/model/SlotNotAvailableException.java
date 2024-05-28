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
package com.amazonaws.services.opensearch.model;

import javax.annotation.Generated;

/**
 * <p>
 * An exception for attempting to schedule a domain action during an unavailable time slot.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotNotAvailableException extends com.amazonaws.services.opensearch.model.AmazonOpenSearchException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     * </p>
     */
    private java.util.List<Long> slotSuggestions;

    /**
     * Constructs a new SlotNotAvailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SlotNotAvailableException(String message) {
        super(message);
    }

    /**
     * <p>
     * Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     * </p>
     * 
     * @return Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SlotSuggestions")
    public java.util.List<Long> getSlotSuggestions() {
        return slotSuggestions;
    }

    /**
     * <p>
     * Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     * </p>
     * 
     * @param slotSuggestions
     *        Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SlotSuggestions")
    public void setSlotSuggestions(java.util.Collection<Long> slotSuggestions) {
        if (slotSuggestions == null) {
            this.slotSuggestions = null;
            return;
        }

        this.slotSuggestions = new java.util.ArrayList<Long>(slotSuggestions);
    }

    /**
     * <p>
     * Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotSuggestions(java.util.Collection)} or {@link #withSlotSuggestions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param slotSuggestions
     *        Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotNotAvailableException withSlotSuggestions(Long... slotSuggestions) {
        if (this.slotSuggestions == null) {
            setSlotSuggestions(new java.util.ArrayList<Long>(slotSuggestions.length));
        }
        for (Long ele : slotSuggestions) {
            this.slotSuggestions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     * </p>
     * 
     * @param slotSuggestions
     *        Alternate time slots during which OpenSearch Service has available capacity to schedule a domain action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotNotAvailableException withSlotSuggestions(java.util.Collection<Long> slotSuggestions) {
        setSlotSuggestions(slotSuggestions);
        return this;
    }

}
