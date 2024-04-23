// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dedicated

import (
	"context"
	"reflect"

	"errors"
	"github.com/ovh/pulumi-ovh/sdk/go/ovh/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// Using a custom template based on an OVHCloud template
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/Dedicated"
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/Me"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			rescue, err := Dedicated.GetServerBoots(ctx, &dedicated.GetServerBootsArgs{
//				ServiceName: "nsxxxxxxx.ip-xx-xx-xx.eu",
//				BootType:    pulumi.StringRef("rescue"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			debian, err := Me.NewInstallationTemplate(ctx, "debian", &Me.InstallationTemplateArgs{
//				BaseTemplateName: pulumi.String("debian12_64"),
//				TemplateName:     pulumi.String("mydebian12"),
//				Customization: &me.InstallationTemplateCustomizationArgs{
//					PostInstallationScriptLink:   pulumi.String("http://test"),
//					PostInstallationScriptReturn: pulumi.String("ok"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Dedicated.NewServerInstallTask(ctx, "serverInstall", &Dedicated.ServerInstallTaskArgs{
//				ServiceName:     pulumi.String("nsxxxxxxx.ip-xx-xx-xx.eu"),
//				TemplateName:    debian.TemplateName,
//				BootidOnDestroy: pulumi.Int(rescue.Results[0]),
//				Details: &dedicated.ServerInstallTaskDetailsArgs{
//					CustomHostname: pulumi.String("mytest"),
//				},
//				UserMetadatas: dedicated.ServerInstallTaskUserMetadataArray{
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("sshKey"),
//						Value: pulumi.String("ssh-ed25519 AAAAC3..."),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// Using a BringYourOwnLinux (BYOLinux) template (with userMetadata)
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh"
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/Dedicated"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			server, err := ovh.GetServer(ctx, &ovh.GetServerArgs{
//				ServiceName: "nsxxxxxxx.ip-xx-xx-xx.eu",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			rescue, err := Dedicated.GetServerBoots(ctx, &dedicated.GetServerBootsArgs{
//				ServiceName: "nsxxxxxxx.ip-xx-xx-xx.eu",
//				BootType:    pulumi.StringRef("rescue"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = Dedicated.NewServerInstallTask(ctx, "serverInstall", &Dedicated.ServerInstallTaskArgs{
//				ServiceName:     pulumi.String(server.ServiceName),
//				TemplateName:    pulumi.String("byolinux_64"),
//				BootidOnDestroy: pulumi.Int(rescue.Results[0]),
//				Details: &dedicated.ServerInstallTaskDetailsArgs{
//					CustomHostname: pulumi.String("mytest"),
//				},
//				UserMetadatas: dedicated.ServerInstallTaskUserMetadataArray{
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("imageURL"),
//						Value: pulumi.String("https://myimage.qcow2"),
//					},
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("imageType"),
//						Value: pulumi.String("qcow2"),
//					},
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("httpHeaders0Key"),
//						Value: pulumi.String("Authorization"),
//					},
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("httpHeaders0Value"),
//						Value: pulumi.String("Basic bG9naW46xxxxxxx="),
//					},
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("imageChecksumType"),
//						Value: pulumi.String("sha512"),
//					},
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("imageCheckSum"),
//						Value: pulumi.String("047122c9ff4d2a69512212104b06c678f5a9cdb22b75467353613ff87ccd03b57b38967e56d810e61366f9d22d6bd39ac0addf4e00a4c6445112a2416af8f225"),
//					},
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key: pulumi.String("configDriveUserData"),
//						Value: pulumi.String(fmt.Sprintf(`#cloud-config
//
// ssh_authorized_keys:
//   - %v
//
// users:
//   - name: patient0
//     sudo: ALL=(ALL) NOPASSWD:ALL
//     groups: users, sudo
//     shell: /bin/bash
//     lock_passwd: false
//     ssh_authorized_keys:
//   - %v
//
// disable_root: false
// packages:
//   - vim
//   - tree
//
// final_message: The system is finally up, after $UPTIME seconds
// `, data.Ovh_me_ssh_key.Mykey.Key, data.Ovh_me_ssh_key.Mykey.Key)),
//
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// # Using a Microsoft Windows server OVHcloud template with a specific language
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh"
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/Dedicated"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			server, err := ovh.GetServer(ctx, &ovh.GetServerArgs{
//				ServiceName: "nsxxxxxxx.ip-xx-xx-xx.eu",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			rescue, err := Dedicated.GetServerBoots(ctx, &dedicated.GetServerBootsArgs{
//				ServiceName: "nsxxxxxxx.ip-xx-xx-xx.eu",
//				BootType:    pulumi.StringRef("rescue"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = Dedicated.NewServerInstallTask(ctx, "serverInstall", &Dedicated.ServerInstallTaskArgs{
//				ServiceName:     pulumi.String(server.ServiceName),
//				TemplateName:    pulumi.String("win2019-std_64"),
//				BootidOnDestroy: pulumi.Int(rescue.Results[0]),
//				Details: &dedicated.ServerInstallTaskDetailsArgs{
//					CustomHostname: pulumi.String("mytest"),
//				},
//				UserMetadatas: dedicated.ServerInstallTaskUserMetadataArray{
//					&dedicated.ServerInstallTaskUserMetadataArgs{
//						Key:   pulumi.String("language"),
//						Value: pulumi.String("fr-fr"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Installation task can be imported using the `service_name` (`nsXXXX.ip...`) of the baremetal server, the `template_name` used  and ths `task_id`, separated by "/" E.g.,
//
// bash
//
// ```sh
// $ pulumi import ovh:Dedicated/serverInstallTask:ServerInstallTask ovh_dedicated_server_install_task nsXXXX.ipXXXX/template_name/12345
// ```
type ServerInstallTask struct {
	pulumi.CustomResourceState

	// If set, reboot the server on the specified boot id during destroy phase.
	BootidOnDestroy pulumi.IntPtrOutput `pulumi:"bootidOnDestroy"`
	// Details of this task. (should be `Install asked`)
	Comment pulumi.StringOutput `pulumi:"comment"`
	// see `details` block below.
	Details ServerInstallTaskDetailsPtrOutput `pulumi:"details"`
	// Completion date in RFC3339 format.
	DoneDate pulumi.StringOutput `pulumi:"doneDate"`
	// Function name (should be `hardInstall`).
	Function pulumi.StringOutput `pulumi:"function"`
	// Last update in RFC3339 format.
	LastUpdate pulumi.StringOutput `pulumi:"lastUpdate"`
	// Partition scheme name.
	PartitionSchemeName pulumi.StringPtrOutput `pulumi:"partitionSchemeName"`
	// The serviceName of your dedicated server.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Task creation date in RFC3339 format.
	StartDate pulumi.StringOutput `pulumi:"startDate"`
	// Task status (should be `done`)
	Status pulumi.StringOutput `pulumi:"status"`
	// Template name.
	TemplateName pulumi.StringOutput `pulumi:"templateName"`
	// see `userMetadata` block below.
	UserMetadatas ServerInstallTaskUserMetadataArrayOutput `pulumi:"userMetadatas"`
}

// NewServerInstallTask registers a new resource with the given unique name, arguments, and options.
func NewServerInstallTask(ctx *pulumi.Context,
	name string, args *ServerInstallTaskArgs, opts ...pulumi.ResourceOption) (*ServerInstallTask, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.TemplateName == nil {
		return nil, errors.New("invalid value for required argument 'TemplateName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServerInstallTask
	err := ctx.RegisterResource("ovh:Dedicated/serverInstallTask:ServerInstallTask", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerInstallTask gets an existing ServerInstallTask resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerInstallTask(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerInstallTaskState, opts ...pulumi.ResourceOption) (*ServerInstallTask, error) {
	var resource ServerInstallTask
	err := ctx.ReadResource("ovh:Dedicated/serverInstallTask:ServerInstallTask", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerInstallTask resources.
type serverInstallTaskState struct {
	// If set, reboot the server on the specified boot id during destroy phase.
	BootidOnDestroy *int `pulumi:"bootidOnDestroy"`
	// Details of this task. (should be `Install asked`)
	Comment *string `pulumi:"comment"`
	// see `details` block below.
	Details *ServerInstallTaskDetails `pulumi:"details"`
	// Completion date in RFC3339 format.
	DoneDate *string `pulumi:"doneDate"`
	// Function name (should be `hardInstall`).
	Function *string `pulumi:"function"`
	// Last update in RFC3339 format.
	LastUpdate *string `pulumi:"lastUpdate"`
	// Partition scheme name.
	PartitionSchemeName *string `pulumi:"partitionSchemeName"`
	// The serviceName of your dedicated server.
	ServiceName *string `pulumi:"serviceName"`
	// Task creation date in RFC3339 format.
	StartDate *string `pulumi:"startDate"`
	// Task status (should be `done`)
	Status *string `pulumi:"status"`
	// Template name.
	TemplateName *string `pulumi:"templateName"`
	// see `userMetadata` block below.
	UserMetadatas []ServerInstallTaskUserMetadata `pulumi:"userMetadatas"`
}

type ServerInstallTaskState struct {
	// If set, reboot the server on the specified boot id during destroy phase.
	BootidOnDestroy pulumi.IntPtrInput
	// Details of this task. (should be `Install asked`)
	Comment pulumi.StringPtrInput
	// see `details` block below.
	Details ServerInstallTaskDetailsPtrInput
	// Completion date in RFC3339 format.
	DoneDate pulumi.StringPtrInput
	// Function name (should be `hardInstall`).
	Function pulumi.StringPtrInput
	// Last update in RFC3339 format.
	LastUpdate pulumi.StringPtrInput
	// Partition scheme name.
	PartitionSchemeName pulumi.StringPtrInput
	// The serviceName of your dedicated server.
	ServiceName pulumi.StringPtrInput
	// Task creation date in RFC3339 format.
	StartDate pulumi.StringPtrInput
	// Task status (should be `done`)
	Status pulumi.StringPtrInput
	// Template name.
	TemplateName pulumi.StringPtrInput
	// see `userMetadata` block below.
	UserMetadatas ServerInstallTaskUserMetadataArrayInput
}

func (ServerInstallTaskState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverInstallTaskState)(nil)).Elem()
}

type serverInstallTaskArgs struct {
	// If set, reboot the server on the specified boot id during destroy phase.
	BootidOnDestroy *int `pulumi:"bootidOnDestroy"`
	// see `details` block below.
	Details *ServerInstallTaskDetails `pulumi:"details"`
	// Partition scheme name.
	PartitionSchemeName *string `pulumi:"partitionSchemeName"`
	// The serviceName of your dedicated server.
	ServiceName string `pulumi:"serviceName"`
	// Template name.
	TemplateName string `pulumi:"templateName"`
	// see `userMetadata` block below.
	UserMetadatas []ServerInstallTaskUserMetadata `pulumi:"userMetadatas"`
}

// The set of arguments for constructing a ServerInstallTask resource.
type ServerInstallTaskArgs struct {
	// If set, reboot the server on the specified boot id during destroy phase.
	BootidOnDestroy pulumi.IntPtrInput
	// see `details` block below.
	Details ServerInstallTaskDetailsPtrInput
	// Partition scheme name.
	PartitionSchemeName pulumi.StringPtrInput
	// The serviceName of your dedicated server.
	ServiceName pulumi.StringInput
	// Template name.
	TemplateName pulumi.StringInput
	// see `userMetadata` block below.
	UserMetadatas ServerInstallTaskUserMetadataArrayInput
}

func (ServerInstallTaskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverInstallTaskArgs)(nil)).Elem()
}

type ServerInstallTaskInput interface {
	pulumi.Input

	ToServerInstallTaskOutput() ServerInstallTaskOutput
	ToServerInstallTaskOutputWithContext(ctx context.Context) ServerInstallTaskOutput
}

func (*ServerInstallTask) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerInstallTask)(nil)).Elem()
}

func (i *ServerInstallTask) ToServerInstallTaskOutput() ServerInstallTaskOutput {
	return i.ToServerInstallTaskOutputWithContext(context.Background())
}

func (i *ServerInstallTask) ToServerInstallTaskOutputWithContext(ctx context.Context) ServerInstallTaskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerInstallTaskOutput)
}

// ServerInstallTaskArrayInput is an input type that accepts ServerInstallTaskArray and ServerInstallTaskArrayOutput values.
// You can construct a concrete instance of `ServerInstallTaskArrayInput` via:
//
//	ServerInstallTaskArray{ ServerInstallTaskArgs{...} }
type ServerInstallTaskArrayInput interface {
	pulumi.Input

	ToServerInstallTaskArrayOutput() ServerInstallTaskArrayOutput
	ToServerInstallTaskArrayOutputWithContext(context.Context) ServerInstallTaskArrayOutput
}

type ServerInstallTaskArray []ServerInstallTaskInput

func (ServerInstallTaskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerInstallTask)(nil)).Elem()
}

func (i ServerInstallTaskArray) ToServerInstallTaskArrayOutput() ServerInstallTaskArrayOutput {
	return i.ToServerInstallTaskArrayOutputWithContext(context.Background())
}

func (i ServerInstallTaskArray) ToServerInstallTaskArrayOutputWithContext(ctx context.Context) ServerInstallTaskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerInstallTaskArrayOutput)
}

// ServerInstallTaskMapInput is an input type that accepts ServerInstallTaskMap and ServerInstallTaskMapOutput values.
// You can construct a concrete instance of `ServerInstallTaskMapInput` via:
//
//	ServerInstallTaskMap{ "key": ServerInstallTaskArgs{...} }
type ServerInstallTaskMapInput interface {
	pulumi.Input

	ToServerInstallTaskMapOutput() ServerInstallTaskMapOutput
	ToServerInstallTaskMapOutputWithContext(context.Context) ServerInstallTaskMapOutput
}

type ServerInstallTaskMap map[string]ServerInstallTaskInput

func (ServerInstallTaskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerInstallTask)(nil)).Elem()
}

func (i ServerInstallTaskMap) ToServerInstallTaskMapOutput() ServerInstallTaskMapOutput {
	return i.ToServerInstallTaskMapOutputWithContext(context.Background())
}

func (i ServerInstallTaskMap) ToServerInstallTaskMapOutputWithContext(ctx context.Context) ServerInstallTaskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerInstallTaskMapOutput)
}

type ServerInstallTaskOutput struct{ *pulumi.OutputState }

func (ServerInstallTaskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerInstallTask)(nil)).Elem()
}

func (o ServerInstallTaskOutput) ToServerInstallTaskOutput() ServerInstallTaskOutput {
	return o
}

func (o ServerInstallTaskOutput) ToServerInstallTaskOutputWithContext(ctx context.Context) ServerInstallTaskOutput {
	return o
}

// If set, reboot the server on the specified boot id during destroy phase.
func (o ServerInstallTaskOutput) BootidOnDestroy() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.IntPtrOutput { return v.BootidOnDestroy }).(pulumi.IntPtrOutput)
}

// Details of this task. (should be `Install asked`)
func (o ServerInstallTaskOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.Comment }).(pulumi.StringOutput)
}

// see `details` block below.
func (o ServerInstallTaskOutput) Details() ServerInstallTaskDetailsPtrOutput {
	return o.ApplyT(func(v *ServerInstallTask) ServerInstallTaskDetailsPtrOutput { return v.Details }).(ServerInstallTaskDetailsPtrOutput)
}

// Completion date in RFC3339 format.
func (o ServerInstallTaskOutput) DoneDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.DoneDate }).(pulumi.StringOutput)
}

// Function name (should be `hardInstall`).
func (o ServerInstallTaskOutput) Function() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.Function }).(pulumi.StringOutput)
}

// Last update in RFC3339 format.
func (o ServerInstallTaskOutput) LastUpdate() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.LastUpdate }).(pulumi.StringOutput)
}

// Partition scheme name.
func (o ServerInstallTaskOutput) PartitionSchemeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringPtrOutput { return v.PartitionSchemeName }).(pulumi.StringPtrOutput)
}

// The serviceName of your dedicated server.
func (o ServerInstallTaskOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Task creation date in RFC3339 format.
func (o ServerInstallTaskOutput) StartDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.StartDate }).(pulumi.StringOutput)
}

// Task status (should be `done`)
func (o ServerInstallTaskOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Template name.
func (o ServerInstallTaskOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerInstallTask) pulumi.StringOutput { return v.TemplateName }).(pulumi.StringOutput)
}

// see `userMetadata` block below.
func (o ServerInstallTaskOutput) UserMetadatas() ServerInstallTaskUserMetadataArrayOutput {
	return o.ApplyT(func(v *ServerInstallTask) ServerInstallTaskUserMetadataArrayOutput { return v.UserMetadatas }).(ServerInstallTaskUserMetadataArrayOutput)
}

type ServerInstallTaskArrayOutput struct{ *pulumi.OutputState }

func (ServerInstallTaskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerInstallTask)(nil)).Elem()
}

func (o ServerInstallTaskArrayOutput) ToServerInstallTaskArrayOutput() ServerInstallTaskArrayOutput {
	return o
}

func (o ServerInstallTaskArrayOutput) ToServerInstallTaskArrayOutputWithContext(ctx context.Context) ServerInstallTaskArrayOutput {
	return o
}

func (o ServerInstallTaskArrayOutput) Index(i pulumi.IntInput) ServerInstallTaskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerInstallTask {
		return vs[0].([]*ServerInstallTask)[vs[1].(int)]
	}).(ServerInstallTaskOutput)
}

type ServerInstallTaskMapOutput struct{ *pulumi.OutputState }

func (ServerInstallTaskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerInstallTask)(nil)).Elem()
}

func (o ServerInstallTaskMapOutput) ToServerInstallTaskMapOutput() ServerInstallTaskMapOutput {
	return o
}

func (o ServerInstallTaskMapOutput) ToServerInstallTaskMapOutputWithContext(ctx context.Context) ServerInstallTaskMapOutput {
	return o
}

func (o ServerInstallTaskMapOutput) MapIndex(k pulumi.StringInput) ServerInstallTaskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerInstallTask {
		return vs[0].(map[string]*ServerInstallTask)[vs[1].(string)]
	}).(ServerInstallTaskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerInstallTaskInput)(nil)).Elem(), &ServerInstallTask{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerInstallTaskArrayInput)(nil)).Elem(), ServerInstallTaskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerInstallTaskMapInput)(nil)).Elem(), ServerInstallTaskMap{})
	pulumi.RegisterOutputType(ServerInstallTaskOutput{})
	pulumi.RegisterOutputType(ServerInstallTaskArrayOutput{})
	pulumi.RegisterOutputType(ServerInstallTaskMapOutput{})
}
