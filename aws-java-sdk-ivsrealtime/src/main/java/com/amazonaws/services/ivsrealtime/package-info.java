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
 * The Amazon Interactive Video Service (IVS) real-time API is REST compatible, using a standard HTTP API and an AWS
 * EventBridge event stream for responses. JSON is used for both requests and responses, including errors.
 * </p>
 * <p>
 * Terminology:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <i>stage</i> is a virtual space where participants can exchange video in real time.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant token</i> is a token that authenticates a participant when they join a stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant object</i> represents participants (people) in the stage and contains information about them. When a
 * token is created, it includes a participant ID; when a participant uses that token to join a stage, the participant
 * is associated with that participant ID. There is a 1:1 mapping between participant tokens and participants.
 * </p>
 * </li>
 * <li>
 * <p>
 * Server-side composition: The <i>composition</i> process composites participants of a stage into a single video and
 * forwards it to a set of outputs (e.g., IVS channels). Composition endpoints support this process.
 * </p>
 * </li>
 * <li>
 * <p>
 * Server-side composition: A <i>composition</i> controls the look of the outputs, including how participants are
 * positioned in the video.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/getting-started.html">Getting Started with Amazon IVS
 * Real-Time Streaming</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Stage</b> — A stage is a virtual space where participants can exchange video in real time.
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
 * information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS stages
 * has no service-specific constraints beyond what is documented there.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS real-time API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resource supports tagging: Stage.
 * </p>
 * <p>
 * At most 50 tags can be applied to a resource.
 * </p>
 * <p>
 * <b>Stages Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateParticipantToken</a> — Creates an additional token for a specified stage. This can be done after stage
 * creation or when tokens expire.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStage</a> — Creates a new stage (and optionally participant tokens).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStage</a> — Shuts down and deletes the specified stage (disconnecting all participants).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectParticipant</a> — Disconnects a specified participant and revokes the participant permanently from a
 * specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetParticipant</a> — Gets information about the specified participant token.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStage</a> — Gets information for the specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStageSession</a> — Gets information for the specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipantEvents</a> — Lists events for a specified participant that occurred during a specified stage
 * session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipants</a> — Lists all participants in a specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStages</a> — Gets summary information about all stages in your account, in the AWS region where the API
 * request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStageSessions</a> — Gets all sessions for a specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateStage</a> — Updates a stage’s configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Composition Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetComposition</a> — Gets information about the specified Composition resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListCompositions</a> — Gets summary information about all Compositions in your account, in the AWS region where
 * the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartComposition</a> — Starts a Composition from a stage based on the configuration provided in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopComposition</a> — Stops and deletes a Composition resource. Any broadcast from the Composition resource is
 * stopped.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>EncoderConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateEncoderConfiguration</a> — Creates an EncoderConfiguration object.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteEncoderConfiguration</a> — Deletes an EncoderConfiguration resource. Ensures that no Compositions are using
 * this template; otherwise, returns an error.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetEncoderConfiguration</a> — Gets information about the specified EncoderConfiguration resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListEncoderConfigurations</a> — Gets summary information about all EncoderConfigurations in your account, in the
 * AWS region where the API request is processed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>StorageConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStorageConfiguration</a> — Creates a new storage configuration, used to enable recording to Amazon S3.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStorageConfiguration</a> — Deletes the storage configuration for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStorageConfiguration</a> — Gets the storage configuration for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStorageConfigurations</a> — Gets summary information about all storage configurations in your account, in the
 * AWS region where the API request is processed.
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
 */
package com.amazonaws.services.ivsrealtime;

