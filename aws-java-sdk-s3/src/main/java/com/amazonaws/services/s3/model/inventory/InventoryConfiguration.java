/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InventoryConfiguration implements Serializable {

    /** The ID used to identify the inventory configuration. */
    private String id;

    /** Contains information about where to publish the inventory results. */
    private InventoryDestination destination;

    /** Specifies whether the inventory is enabled or disabled. */
    private Boolean isEnabled;

    /** Specifies an inventory inventoryFilter. */
    private InventoryFilter inventoryFilter;

    /** Specifies which object version(s) to included in the inventory results. */
    private String includedObjectVersions;

    /** List to store the optional fields that are included in the inventory results. */
    private List<String> optionalFields;

    /** Specifies the schedule for generating inventory results. */
    private InventorySchedule schedule;


    /**
     * Returns the ID used to identify the inventory configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID used to identify the inventory configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the ID used to identify the inventory configuration
     * and returns this object for method chaining.
     */
    public InventoryConfiguration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns the {@link InventoryDestination} that contains information
     * about where to publish the inventory results.
     */
    public InventoryDestination getDestination() {
        return destination;
    }

    /**
     * Sets the {@link InventoryDestination} that contains information
     * about where to publish the inventory results.
     */
    public void setDestination(InventoryDestination destination) {
        this.destination = destination;
    }

    /**
     * Sets the {@link InventoryDestination} that contains information
     * about where to publish the inventory results and returns
     * this object for method chaining.
     */
    public InventoryConfiguration withDestination(InventoryDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * Returns true if the inventory is enabled or
     * false if inventory is disabled.
     */
    public Boolean isEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value whether the inventory is enabled or disabled.
     *
     * The value true indicates the inventory is enabled and
     * false indicates the inventory is disabled.
     */
    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    /**
     * Sets the value whether the inventory is enabled or disabled
     * and returns this object for method chaining.
     *
     * The value true indicates the inventory is enabled and
     * false indicates the inventory is disabled.
     */
    public InventoryConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * Returns the inventoryFilter used to describe a set of objects
     * to include in inventory results.
     */
    public InventoryFilter getInventoryFilter() {
        return inventoryFilter;
    }

    /**
     * Sets the inventoryFilter used to describe a set of objects
     * to include in inventory results.
     */
    public void setInventoryFilter(InventoryFilter inventoryFilter) {
        this.inventoryFilter = inventoryFilter;
    }

    /**
     * Sets the inventoryFilter used to describe a set of objects
     * to include in inventory results.
     *
     * The {@link InventoryConfiguration} object is returned
     * for method chaining.
     */
    public InventoryConfiguration withFilter(InventoryFilter inventoryFilter) {
        setInventoryFilter(inventoryFilter);
        return this;
    }

    /**
     * Returns which object version(s) to included in the inventory results.
     */
    public String getIncludedObjectVersions() {
        return includedObjectVersions;
    }

    /**
     * Sets which object version(s) to included in the inventory results.
     */
    public void setIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
    }

    /**
     * Sets which object version(s) to included in the inventory results
     * and returns this object for method chaining.
     */
    public InventoryConfiguration withIncludedObjectVersions(String includedObjectVersions) {
        setIncludedObjectVersions(includedObjectVersions);
        return this;
    }

    /**
     * Sets which object version(s) to included in the inventory results.
     */
    public void setIncludedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
        setIncludedObjectVersions(includedObjectVersions == null ? (String) null : includedObjectVersions.toString());
    }

    /**
     * Sets which object version(s) to included in the inventory results
     * and returns this object for method chaining.
     */
    public InventoryConfiguration withIncludedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
        setIncludedObjectVersions(includedObjectVersions);
        return this;
    }

    /**
     * Returns the optional fields that are included in the inventory results.
     */
    public List<String> getOptionalFields() {
        return optionalFields;
    }

    /**
     * Sets the optional fields that are included in the inventory results.
     */
    public void setOptionalFields(List<String> optionalFields) {
        this.optionalFields = optionalFields;
    }

    /**
     * Sets the optional fields that are included in the inventory results.
     * The {@link InventoryConfiguration} object is returned for method chaining.
     */
    public InventoryConfiguration withOptionalFields(List<String> optionalFields) {
        setOptionalFields(optionalFields);
        return this;
    }

    /**
     * Add a field to the list of optional fields that are included in the inventory results.
     */
    public void addOptionalField(String optionalField) {
        if (optionalField == null) {
            return;
        } else if (this.optionalFields == null) {
            this.optionalFields = new ArrayList<String >();
        }
        this.optionalFields.add(optionalField);
    }

    /**
     * Add a field to the list of optional fields that are included in the inventory results.
     */
    public void addOptionalField(InventoryOptionalField optionalField) {
        addOptionalField(optionalField == null ? (String) null : optionalField.toString());
    }

    /**
     * Returns the schedule for generating inventory results.
     */
    public InventorySchedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the schedule for generating inventory results.
     */
    public void setSchedule(InventorySchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Returns the schedule for generating inventory results
     * and returns {@link InventoryConfiguration} object
     * for method chaining.
     */
    public InventoryConfiguration withSchedule(InventorySchedule schedule) {
        setSchedule(schedule);
        return this;
    }

}
