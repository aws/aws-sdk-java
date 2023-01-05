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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration settings for a user interface (UI) element for an Amplify app. A component is configured
 * as a primary, stand-alone UI element. Use <code>ComponentChild</code> to configure an instance of a
 * <code>Component</code>. A <code>ComponentChild</code> instance inherits the configuration of the main
 * <code>Component</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/Component" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Component implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the Amplify app associated with the component.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The information to connect a component's properties to data at runtime. You can't specify <code>tags</code> as a
     * valid property for <code>bindingProperties</code>.
     * </p>
     * <p/>
     */
    private java.util.Map<String, ComponentBindingPropertiesValue> bindingProperties;
    /**
     * <p>
     * A list of the component's <code>ComponentChild</code> instances.
     * </p>
     */
    private java.util.List<ComponentChild> children;
    /**
     * <p>
     * The data binding configuration for the component's properties. Use this for a collection component. You can't
     * specify <code>tags</code> as a valid property for <code>collectionProperties</code>.
     * </p>
     */
    private java.util.Map<String, ComponentDataConfiguration> collectionProperties;
    /**
     * <p>
     * The type of the component. This can be an Amplify custom UI component or another custom component.
     * </p>
     */
    private String componentType;
    /**
     * <p>
     * The time that the component was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio that
     * allows you to bind events and actions to components.
     * </p>
     */
    private java.util.Map<String, ComponentEvent> events;
    /**
     * <p>
     * The unique ID of the component.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time that the component was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the component's properties that can be overriden in a customized instance of the component. You can't
     * specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> overrides;
    /**
     * <p>
     * Describes the component's properties. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     */
    private java.util.Map<String, ComponentProperty> properties;
    /**
     * <p>
     * The schema version of the component when it was imported.
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The unique ID of the component in its original source system, such as Figma.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * One or more key-value pairs to use when tagging the component.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of the component's variants. A variant is a unique style configuration of a main component.
     * </p>
     */
    private java.util.List<ComponentVariant> variants;

    /**
     * <p>
     * The unique ID of the Amplify app associated with the component.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app associated with the component.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app associated with the component.
     * </p>
     * 
     * @return The unique ID of the Amplify app associated with the component.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app associated with the component.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app associated with the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The information to connect a component's properties to data at runtime. You can't specify <code>tags</code> as a
     * valid property for <code>bindingProperties</code>.
     * </p>
     * <p/>
     * 
     * @return The information to connect a component's properties to data at runtime. You can't specify
     *         <code>tags</code> as a valid property for <code>bindingProperties</code>.
     *         </p>
     */

    public java.util.Map<String, ComponentBindingPropertiesValue> getBindingProperties() {
        return bindingProperties;
    }

    /**
     * <p>
     * The information to connect a component's properties to data at runtime. You can't specify <code>tags</code> as a
     * valid property for <code>bindingProperties</code>.
     * </p>
     * <p/>
     * 
     * @param bindingProperties
     *        The information to connect a component's properties to data at runtime. You can't specify
     *        <code>tags</code> as a valid property for <code>bindingProperties</code>.
     *        </p>
     */

    public void setBindingProperties(java.util.Map<String, ComponentBindingPropertiesValue> bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

    /**
     * <p>
     * The information to connect a component's properties to data at runtime. You can't specify <code>tags</code> as a
     * valid property for <code>bindingProperties</code>.
     * </p>
     * <p/>
     * 
     * @param bindingProperties
     *        The information to connect a component's properties to data at runtime. You can't specify
     *        <code>tags</code> as a valid property for <code>bindingProperties</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withBindingProperties(java.util.Map<String, ComponentBindingPropertiesValue> bindingProperties) {
        setBindingProperties(bindingProperties);
        return this;
    }

    /**
     * Add a single BindingProperties entry
     *
     * @see Component#withBindingProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Component addBindingPropertiesEntry(String key, ComponentBindingPropertiesValue value) {
        if (null == this.bindingProperties) {
            this.bindingProperties = new java.util.HashMap<String, ComponentBindingPropertiesValue>();
        }
        if (this.bindingProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.bindingProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BindingProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component clearBindingPropertiesEntries() {
        this.bindingProperties = null;
        return this;
    }

    /**
     * <p>
     * A list of the component's <code>ComponentChild</code> instances.
     * </p>
     * 
     * @return A list of the component's <code>ComponentChild</code> instances.
     */

    public java.util.List<ComponentChild> getChildren() {
        return children;
    }

    /**
     * <p>
     * A list of the component's <code>ComponentChild</code> instances.
     * </p>
     * 
     * @param children
     *        A list of the component's <code>ComponentChild</code> instances.
     */

    public void setChildren(java.util.Collection<ComponentChild> children) {
        if (children == null) {
            this.children = null;
            return;
        }

        this.children = new java.util.ArrayList<ComponentChild>(children);
    }

    /**
     * <p>
     * A list of the component's <code>ComponentChild</code> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildren(java.util.Collection)} or {@link #withChildren(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param children
     *        A list of the component's <code>ComponentChild</code> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withChildren(ComponentChild... children) {
        if (this.children == null) {
            setChildren(new java.util.ArrayList<ComponentChild>(children.length));
        }
        for (ComponentChild ele : children) {
            this.children.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the component's <code>ComponentChild</code> instances.
     * </p>
     * 
     * @param children
     *        A list of the component's <code>ComponentChild</code> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withChildren(java.util.Collection<ComponentChild> children) {
        setChildren(children);
        return this;
    }

    /**
     * <p>
     * The data binding configuration for the component's properties. Use this for a collection component. You can't
     * specify <code>tags</code> as a valid property for <code>collectionProperties</code>.
     * </p>
     * 
     * @return The data binding configuration for the component's properties. Use this for a collection component. You
     *         can't specify <code>tags</code> as a valid property for <code>collectionProperties</code>.
     */

    public java.util.Map<String, ComponentDataConfiguration> getCollectionProperties() {
        return collectionProperties;
    }

    /**
     * <p>
     * The data binding configuration for the component's properties. Use this for a collection component. You can't
     * specify <code>tags</code> as a valid property for <code>collectionProperties</code>.
     * </p>
     * 
     * @param collectionProperties
     *        The data binding configuration for the component's properties. Use this for a collection component. You
     *        can't specify <code>tags</code> as a valid property for <code>collectionProperties</code>.
     */

    public void setCollectionProperties(java.util.Map<String, ComponentDataConfiguration> collectionProperties) {
        this.collectionProperties = collectionProperties;
    }

    /**
     * <p>
     * The data binding configuration for the component's properties. Use this for a collection component. You can't
     * specify <code>tags</code> as a valid property for <code>collectionProperties</code>.
     * </p>
     * 
     * @param collectionProperties
     *        The data binding configuration for the component's properties. Use this for a collection component. You
     *        can't specify <code>tags</code> as a valid property for <code>collectionProperties</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withCollectionProperties(java.util.Map<String, ComponentDataConfiguration> collectionProperties) {
        setCollectionProperties(collectionProperties);
        return this;
    }

    /**
     * Add a single CollectionProperties entry
     *
     * @see Component#withCollectionProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Component addCollectionPropertiesEntry(String key, ComponentDataConfiguration value) {
        if (null == this.collectionProperties) {
            this.collectionProperties = new java.util.HashMap<String, ComponentDataConfiguration>();
        }
        if (this.collectionProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.collectionProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CollectionProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component clearCollectionPropertiesEntries() {
        this.collectionProperties = null;
        return this;
    }

    /**
     * <p>
     * The type of the component. This can be an Amplify custom UI component or another custom component.
     * </p>
     * 
     * @param componentType
     *        The type of the component. This can be an Amplify custom UI component or another custom component.
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p>
     * The type of the component. This can be an Amplify custom UI component or another custom component.
     * </p>
     * 
     * @return The type of the component. This can be an Amplify custom UI component or another custom component.
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p>
     * The type of the component. This can be an Amplify custom UI component or another custom component.
     * </p>
     * 
     * @param componentType
     *        The type of the component. This can be an Amplify custom UI component or another custom component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withComponentType(String componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p>
     * The time that the component was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the component was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the component was created.
     * </p>
     * 
     * @return The time that the component was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the component was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @return The name of the backend environment that is a part of the Amplify app.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio that
     * allows you to bind events and actions to components.
     * </p>
     * 
     * @return Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio
     *         that allows you to bind events and actions to components.
     */

    public java.util.Map<String, ComponentEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio that
     * allows you to bind events and actions to components.
     * </p>
     * 
     * @param events
     *        Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio
     *        that allows you to bind events and actions to components.
     */

    public void setEvents(java.util.Map<String, ComponentEvent> events) {
        this.events = events;
    }

    /**
     * <p>
     * Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio that
     * allows you to bind events and actions to components.
     * </p>
     * 
     * @param events
     *        Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio
     *        that allows you to bind events and actions to components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withEvents(java.util.Map<String, ComponentEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * Add a single Events entry
     *
     * @see Component#withEvents
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Component addEventsEntry(String key, ComponentEvent value) {
        if (null == this.events) {
            this.events = new java.util.HashMap<String, ComponentEvent>();
        }
        if (this.events.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.events.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Events.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component clearEventsEntries() {
        this.events = null;
        return this;
    }

    /**
     * <p>
     * The unique ID of the component.
     * </p>
     * 
     * @param id
     *        The unique ID of the component.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the component.
     * </p>
     * 
     * @return The unique ID of the component.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the component.
     * </p>
     * 
     * @param id
     *        The unique ID of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time that the component was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the component was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time that the component was modified.
     * </p>
     * 
     * @return The time that the component was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time that the component was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the component was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the component's properties that can be overriden in a customized instance of the component. You can't
     * specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     * 
     * @return Describes the component's properties that can be overriden in a customized instance of the component. You
     *         can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     */

    public java.util.Map<String, java.util.Map<String, String>> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * Describes the component's properties that can be overriden in a customized instance of the component. You can't
     * specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     * 
     * @param overrides
     *        Describes the component's properties that can be overriden in a customized instance of the component. You
     *        can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     */

    public void setOverrides(java.util.Map<String, java.util.Map<String, String>> overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * Describes the component's properties that can be overriden in a customized instance of the component. You can't
     * specify <code>tags</code> as a valid property for <code>overrides</code>.
     * </p>
     * 
     * @param overrides
     *        Describes the component's properties that can be overriden in a customized instance of the component. You
     *        can't specify <code>tags</code> as a valid property for <code>overrides</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withOverrides(java.util.Map<String, java.util.Map<String, String>> overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * Add a single Overrides entry
     *
     * @see Component#withOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Component addOverridesEntry(String key, java.util.Map<String, String> value) {
        if (null == this.overrides) {
            this.overrides = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.overrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.overrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Overrides.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component clearOverridesEntries() {
        this.overrides = null;
        return this;
    }

    /**
     * <p>
     * Describes the component's properties. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     * 
     * @return Describes the component's properties. You can't specify <code>tags</code> as a valid property for
     *         <code>properties</code>.
     */

    public java.util.Map<String, ComponentProperty> getProperties() {
        return properties;
    }

    /**
     * <p>
     * Describes the component's properties. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     * 
     * @param properties
     *        Describes the component's properties. You can't specify <code>tags</code> as a valid property for
     *        <code>properties</code>.
     */

    public void setProperties(java.util.Map<String, ComponentProperty> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * Describes the component's properties. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     * 
     * @param properties
     *        Describes the component's properties. You can't specify <code>tags</code> as a valid property for
     *        <code>properties</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withProperties(java.util.Map<String, ComponentProperty> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see Component#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Component addPropertiesEntry(String key, ComponentProperty value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, ComponentProperty>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The schema version of the component when it was imported.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of the component when it was imported.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version of the component when it was imported.
     * </p>
     * 
     * @return The schema version of the component when it was imported.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version of the component when it was imported.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of the component when it was imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The unique ID of the component in its original source system, such as Figma.
     * </p>
     * 
     * @param sourceId
     *        The unique ID of the component in its original source system, such as Figma.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The unique ID of the component in its original source system, such as Figma.
     * </p>
     * 
     * @return The unique ID of the component in its original source system, such as Figma.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The unique ID of the component in its original source system, such as Figma.
     * </p>
     * 
     * @param sourceId
     *        The unique ID of the component in its original source system, such as Figma.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the component.
     * </p>
     * 
     * @return One or more key-value pairs to use when tagging the component.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the component.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the component.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the component.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Component#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Component addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of the component's variants. A variant is a unique style configuration of a main component.
     * </p>
     * 
     * @return A list of the component's variants. A variant is a unique style configuration of a main component.
     */

    public java.util.List<ComponentVariant> getVariants() {
        return variants;
    }

    /**
     * <p>
     * A list of the component's variants. A variant is a unique style configuration of a main component.
     * </p>
     * 
     * @param variants
     *        A list of the component's variants. A variant is a unique style configuration of a main component.
     */

    public void setVariants(java.util.Collection<ComponentVariant> variants) {
        if (variants == null) {
            this.variants = null;
            return;
        }

        this.variants = new java.util.ArrayList<ComponentVariant>(variants);
    }

    /**
     * <p>
     * A list of the component's variants. A variant is a unique style configuration of a main component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariants(java.util.Collection)} or {@link #withVariants(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param variants
     *        A list of the component's variants. A variant is a unique style configuration of a main component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withVariants(ComponentVariant... variants) {
        if (this.variants == null) {
            setVariants(new java.util.ArrayList<ComponentVariant>(variants.length));
        }
        for (ComponentVariant ele : variants) {
            this.variants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the component's variants. A variant is a unique style configuration of a main component.
     * </p>
     * 
     * @param variants
     *        A list of the component's variants. A variant is a unique style configuration of a main component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withVariants(java.util.Collection<ComponentVariant> variants) {
        setVariants(variants);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBindingProperties() != null)
            sb.append("BindingProperties: ").append(getBindingProperties()).append(",");
        if (getChildren() != null)
            sb.append("Children: ").append(getChildren()).append(",");
        if (getCollectionProperties() != null)
            sb.append("CollectionProperties: ").append(getCollectionProperties()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVariants() != null)
            sb.append("Variants: ").append(getVariants());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Component == false)
            return false;
        Component other = (Component) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBindingProperties() == null ^ this.getBindingProperties() == null)
            return false;
        if (other.getBindingProperties() != null && other.getBindingProperties().equals(this.getBindingProperties()) == false)
            return false;
        if (other.getChildren() == null ^ this.getChildren() == null)
            return false;
        if (other.getChildren() != null && other.getChildren().equals(this.getChildren()) == false)
            return false;
        if (other.getCollectionProperties() == null ^ this.getCollectionProperties() == null)
            return false;
        if (other.getCollectionProperties() != null && other.getCollectionProperties().equals(this.getCollectionProperties()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVariants() == null ^ this.getVariants() == null)
            return false;
        if (other.getVariants() != null && other.getVariants().equals(this.getVariants()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBindingProperties() == null) ? 0 : getBindingProperties().hashCode());
        hashCode = prime * hashCode + ((getChildren() == null) ? 0 : getChildren().hashCode());
        hashCode = prime * hashCode + ((getCollectionProperties() == null) ? 0 : getCollectionProperties().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVariants() == null) ? 0 : getVariants().hashCode());
        return hashCode;
    }

    @Override
    public Component clone() {
        try {
            return (Component) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
