// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * > __NOTE__ This resource will be removed in next release, please use userMetada instead.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@ovhcloud/pulumi-ovh";
 *
 * const mykey = new ovh.me.SshKey("mykey", {
 *     key: "ssh-ed25519 AAAAC3...",
 *     keyName: "mykey",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class SshKey extends pulumi.CustomResource {
    /**
     * Get an existing SshKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SshKeyState, opts?: pulumi.CustomResourceOptions): SshKey {
        return new SshKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ovh:Me/sshKey:SshKey';

    /**
     * Returns true if the given object is an instance of SshKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SshKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SshKey.__pulumiType;
    }

    /**
     * True when this public SSH key is used for rescue mode and reinstallations.
     *
     * @deprecated use userMetada instead
     */
    public readonly default!: pulumi.Output<boolean>;
    /**
     * The content of the public key in the form "ssh-algo content", e.g. "ssh-ed25519 AAAAC3...".
     *
     * @deprecated use userMetada instead
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * The friendly name of this SSH key.
     *
     * @deprecated use userMetada instead
     */
    public readonly keyName!: pulumi.Output<string>;

    /**
     * Create a SshKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SshKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SshKeyArgs | SshKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SshKeyState | undefined;
            resourceInputs["default"] = state ? state.default : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["keyName"] = state ? state.keyName : undefined;
        } else {
            const args = argsOrState as SshKeyArgs | undefined;
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.keyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyName'");
            }
            resourceInputs["default"] = args ? args.default : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["keyName"] = args ? args.keyName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SshKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SshKey resources.
 */
export interface SshKeyState {
    /**
     * True when this public SSH key is used for rescue mode and reinstallations.
     *
     * @deprecated use userMetada instead
     */
    default?: pulumi.Input<boolean>;
    /**
     * The content of the public key in the form "ssh-algo content", e.g. "ssh-ed25519 AAAAC3...".
     *
     * @deprecated use userMetada instead
     */
    key?: pulumi.Input<string>;
    /**
     * The friendly name of this SSH key.
     *
     * @deprecated use userMetada instead
     */
    keyName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SshKey resource.
 */
export interface SshKeyArgs {
    /**
     * True when this public SSH key is used for rescue mode and reinstallations.
     *
     * @deprecated use userMetada instead
     */
    default?: pulumi.Input<boolean>;
    /**
     * The content of the public key in the form "ssh-algo content", e.g. "ssh-ed25519 AAAAC3...".
     *
     * @deprecated use userMetada instead
     */
    key: pulumi.Input<string>;
    /**
     * The friendly name of this SSH key.
     *
     * @deprecated use userMetada instead
     */
    keyName: pulumi.Input<string>;
}
