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

/**
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon IVS Chat control-plane API enables you to create and manage Amazon IVS Chat resources. You also need to
 * integrate with the <a href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html">
 * Amazon IVS Chat Messaging API</a>, to enable users to interact with chat rooms in real time.
 * </p>
 * <p>
 * The API is an AWS regional service. For a list of supported regions and Amazon IVS Chat HTTPS service endpoints, see
 * the Amazon IVS Chat information on the <a href="https://docs.aws.amazon.com/general/latest/gr/ivs.html">Amazon IVS
 * page</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Notes on terminology:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * You create service applications using the Amazon IVS Chat API. We refer to these as <i>applications</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You create front-end client applications (browser and Android/iOS apps) using the Amazon IVS Chat Messaging API. We
 * refer to these as <i>clients</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Key Concepts</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>LoggingConfiguration</b> — A configuration that allows customers to store and record sent messages in a chat room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Room</b> — The central Amazon IVS Chat resource through which clients connect to and exchange chat messages.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging</b>
 * </p>
 * <p>
 * A <i>tag</i> is a metadata label that you assign to an AWS resource. A tag comprises a <i>key</i> and a <i>value</i>,
 * both set by you. For example, you might set a tag as <code>topic:nature</code> to label a particular video category.
 * See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for more
 * information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has
 * no service-specific constraints beyond what is documented there.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS Chat API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resource supports tagging: Room.
 * </p>
 * <p>
 * At most 50 tags can be applied to a resource.
 * </p>
 * <p>
 * <b>API Access Security</b>
 * </p>
 * <p>
 * Your Amazon IVS Chat applications (service applications and clients) must be authenticated and authorized to access
 * Amazon IVS Chat resources. Note the differences between these concepts:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Authentication</i> is about verifying identity. Requests to the Amazon IVS Chat API must be signed to verify your
 * identity.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Authorization</i> is about granting permissions. Your IAM roles need to have permissions for Amazon IVS Chat API
 * requests.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Users (viewers) connect to a room using secure access tokens that you create using the <a>CreateChatToken</a>
 * endpoint through the AWS SDK. You call CreateChatToken for every user’s chat session, passing identity and
 * authorization information about the user.
 * </p>
 * <p>
 * <b>Signing API Requests</b>
 * </p>
 * <p>
 * HTTP API requests must be signed with an AWS SigV4 signature using your AWS security credentials. The AWS Command
 * Line Interface (CLI) and the AWS SDKs take care of signing the underlying API calls for you. However, if your
 * application calls the Amazon IVS Chat HTTP API directly, it’s your responsibility to sign the requests.
 * </p>
 * <p>
 * You generate a signature using valid AWS credentials for an IAM role that has permission to perform the requested
 * action. For example, DeleteMessage requests must be made using an IAM role that has the
 * <code>ivschat:DeleteMessage</code> permission.
 * </p>
 * <p>
 * For more information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Authentication and generating signatures — See <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating Requests
 * (Amazon Web Services Signature Version 4)</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Managing Amazon IVS permissions — See <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/security-iam.html">Identity and Access Management</a> on the
 * Security page of the <i>Amazon IVS User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Resource Names (ARNs)</b>
 * </p>
 * <p>
 * ARNs uniquely identify AWS resources. An ARN is required when you need to specify a resource unambiguously across all
 * of AWS, such as in IAM policies and API calls. For more information, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Messaging Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteMessage</a> — Sends an event to a specific room which directs clients to delete a specific message; that is,
 * unrender it from view and delete it from the client’s chat history. This event’s <code>EventName</code> is
 * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
 * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectUser</a> — Disconnects all connections using a specified user ID from a room. This replicates the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
 * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>SendEvent</a> — Sends an event to a room. Use this within your application’s business logic to send events to
 * clients of a room; e.g., to notify clients to change the way the chat UI is rendered.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Chat Token Endpoint</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateChatToken</a> — Creates an encrypted token that is used by a chat participant to establish an individual
 * WebSocket chat connection to a room. When the token is used to connect to chat, the connection is valid for the
 * session duration specified in the request. The token becomes invalid at the token-expiration timestamp included in
 * the response.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Room Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateRoom</a> — Creates a room that allows clients to connect and pass messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRoom</a> — Deletes the specified room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRoom</a> — Gets the specified room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRooms</a> — Gets summary information about all your rooms in the AWS region where the API request is
 * processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRoom</a> — Updates a room’s configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Logging Configuration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateLoggingConfiguration</a> — Creates a logging configuration that allows clients to store and record sent
 * messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteLoggingConfiguration</a> — Deletes the specified logging configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetLoggingConfiguration</a> — Gets the specified logging configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListLoggingConfigurations</a> — Gets summary information about all your logging configurations in the AWS region
 * where the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateLoggingConfiguration</a> — Updates a specified logging configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tags Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for the AWS resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from the resource with the specified ARN.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All the above are HTTP operations. There is a separate <i>messaging</i> API for managing Chat resources; see the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html"> Amazon IVS Chat Messaging
 * API Reference</a>.
 * </p>
 */
package com.amazonaws.services.ivschat;

