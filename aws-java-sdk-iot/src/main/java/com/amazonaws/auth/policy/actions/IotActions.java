package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

public enum IotActions implements Action {

    /** Represents any action being taken on Amazon IoT. */
    AllIotActions("iot:*"),

    /** Represents the permission to connect to the AWS IoT message broker */
    Connect("iot:Connect"),

    /** Represents the permission to publish on an MQTT topic */
    Publish("iot:Publish"),

    /** Represents the permission to receive a message from AWS IoT */
    Receive("iot:Receive"),

    /** Represents the permission to subscribe to an MQTT topic or topic filter */
    Subscribe("iot:Subscribe"),

    /** Represents the permission to delete a thing shadow */
    DeleteThingShadow("iot:DeleteThingShadow"),

    /** Represents the permission to retrieve a thing shadow */
    GetThingShadow("iot:GetThingShadow"),

    /** Represents the permission to update a thing shadow */
    UpdateThingShadow("iot:UpdateThingShadow");

    private final String action;

    private IotActions(String action) { this.action = action; }

    public String getActionName() {
        return this.action;
    }
}
