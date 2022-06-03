// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.codeInsight.completion.vuetify

object VuetifyIcons {

  val materialAndFontAwesome = listOf(
    //  https://github.com/google/material-design-icons/blob/master/iconfont/codepoints
    "3d_rotation",
    "ac_unit",
    "access_alarm",
    "access_alarms",
    "access_time",
    "accessibility",
    "accessible",
    "account_balance",
    "account_balance_wallet",
    "account_box",
    "account_circle",
    "adb",
    "add",
    "add_a_photo",
    "add_alarm",
    "add_alert",
    "add_box",
    "add_circle",
    "add_circle_outline",
    "add_location",
    "add_shopping_cart",
    "add_to_photos",
    "add_to_queue",
    "adjust",
    "airline_seat_flat",
    "airline_seat_flat_angled",
    "airline_seat_individual_suite",
    "airline_seat_legroom_extra",
    "airline_seat_legroom_normal",
    "airline_seat_legroom_reduced",
    "airline_seat_recline_extra",
    "airline_seat_recline_normal",
    "airplanemode_active",
    "airplanemode_inactive",
    "airplay",
    "airport_shuttle",
    "alarm",
    "alarm_add",
    "alarm_off",
    "alarm_on",
    "album",
    "all_inclusive",
    "all_out",
    "android",
    "announcement",
    "apps",
    "archive",
    "arrow_back",
    "arrow_downward",
    "arrow_drop_down",
    "arrow_drop_down_circle",
    "arrow_drop_up",
    "arrow_forward",
    "arrow_upward",
    "art_track",
    "aspect_ratio",
    "assessment",
    "assignment",
    "assignment_ind",
    "assignment_late",
    "assignment_return",
    "assignment_returned",
    "assignment_turned_in",
    "assistant",
    "assistant_photo",
    "attach_file",
    "attach_money",
    "attachment",
    "audiotrack",
    "autorenew",
    "av_timer",
    "backspace",
    "backup",
    "battery_alert",
    "battery_charging_full",
    "battery_full",
    "battery_std",
    "battery_unknown",
    "beach_access",
    "beenhere",
    "block",
    "bluetooth",
    "bluetooth_audio",
    "bluetooth_connected",
    "bluetooth_disabled",
    "bluetooth_searching",
    "blur_circular",
    "blur_linear",
    "blur_off",
    "blur_on",
    "book",
    "bookmark",
    "bookmark_border",
    "border_all",
    "border_bottom",
    "border_clear",
    "border_color",
    "border_horizontal",
    "border_inner",
    "border_left",
    "border_outer",
    "border_right",
    "border_style",
    "border_top",
    "border_vertical",
    "branding_watermark",
    "brightness_1",
    "brightness_2",
    "brightness_3",
    "brightness_4",
    "brightness_5",
    "brightness_6",
    "brightness_7",
    "brightness_auto",
    "brightness_high",
    "brightness_low",
    "brightness_medium",
    "broken_image",
    "brush",
    "bubble_chart",
    "bug_report",
    "build",
    "burst_mode",
    "business",
    "business_center",
    "cached",
    "cake",
    "call",
    "call_end",
    "call_made",
    "call_merge",
    "call_missed",
    "call_missed_outgoing",
    "call_received",
    "call_split",
    "call_to_action",
    "camera",
    "camera_alt",
    "camera_enhance",
    "camera_front",
    "camera_rear",
    "camera_roll",
    "cancel",
    "card_giftcard",
    "card_membership",
    "card_travel",
    "casino",
    "cast",
    "cast_connected",
    "center_focus_strong",
    "center_focus_weak",
    "change_history",
    "chat",
    "chat_bubble",
    "chat_bubble_outline",
    "check",
    "check_box",
    "check_box_outline_blank",
    "check_circle",
    "chevron_left",
    "chevron_right",
    "child_care",
    "child_friendly",
    "chrome_reader_mode",
    "class",
    "clear",
    "clear_all",
    "close",
    "closed_caption",
    "cloud",
    "cloud_circle",
    "cloud_done",
    "cloud_download",
    "cloud_off",
    "cloud_queue",
    "cloud_upload",
    "code",
    "collections",
    "collections_bookmark",
    "color_lens",
    "colorize",
    "comment",
    "compare",
    "compare_arrows",
    "computer",
    "confirmation_number",
    "contact_mail",
    "contact_phone",
    "contacts",
    "content_copy",
    "content_cut",
    "content_paste",
    "control_point",
    "control_point_duplicate",
    "copyright",
    "create",
    "create_new_folder",
    "credit_card",
    "crop",
    "crop_16_9",
    "crop_3_2",
    "crop_5_4",
    "crop_7_5",
    "crop_din",
    "crop_free",
    "crop_landscape",
    "crop_original",
    "crop_portrait",
    "crop_rotate",
    "crop_square",
    "dashboard",
    "data_usage",
    "date_range",
    "dehaze",
    "delete",
    "delete_forever",
    "delete_sweep",
    "description",
    "desktop_mac",
    "desktop_windows",
    "details",
    "developer_board",
    "developer_mode",
    "device_hub",
    "devices",
    "devices_other",
    "dialer_sip",
    "dialpad",
    "directions",
    "directions_bike",
    "directions_boat",
    "directions_bus",
    "directions_car",
    "directions_railway",
    "directions_run",
    "directions_subway",
    "directions_transit",
    "directions_walk",
    "disc_full",
    "dns",
    "do_not_disturb",
    "do_not_disturb_alt",
    "do_not_disturb_off",
    "do_not_disturb_on",
    "dock",
    "domain",
    "done",
    "done_all",
    "donut_large",
    "donut_small",
    "drafts",
    "drag_handle",
    "drive_eta",
    "dvr",
    "edit",
    "edit_location",
    "eject",
    "email",
    "enhanced_encryption",
    "equalizer",
    "error",
    "error_outline",
    "euro_symbol",
    "ev_station",
    "event",
    "event_available",
    "event_busy",
    "event_note",
    "event_seat",
    "exit_to_app",
    "expand_less",
    "expand_more",
    "explicit",
    "explore",
    "exposure",
    "exposure_neg_1",
    "exposure_neg_2",
    "exposure_plus_1",
    "exposure_plus_2",
    "exposure_zero",
    "extension",
    "face",
    "fast_forward",
    "fast_rewind",
    "favorite",
    "favorite_border",
    "featured_play_list",
    "featured_video",
    "feedback",
    "fiber_dvr",
    "fiber_manual_record",
    "fiber_new",
    "fiber_pin",
    "fiber_smart_record",
    "file_download",
    "file_upload",
    "filter",
    "filter_1",
    "filter_2",
    "filter_3",
    "filter_4",
    "filter_5",
    "filter_6",
    "filter_7",
    "filter_8",
    "filter_9",
    "filter_9_plus",
    "filter_b_and_w",
    "filter_center_focus",
    "filter_drama",
    "filter_frames",
    "filter_hdr",
    "filter_list",
    "filter_none",
    "filter_tilt_shift",
    "filter_vintage",
    "find_in_page",
    "find_replace",
    "fingerprint",
    "first_page",
    "fitness_center",
    "flag",
    "flare",
    "flash_auto",
    "flash_off",
    "flash_on",
    "flight",
    "flight_land",
    "flight_takeoff",
    "flip",
    "flip_to_back",
    "flip_to_front",
    "folder",
    "folder_open",
    "folder_shared",
    "folder_special",
    "font_download",
    "format_align_center",
    "format_align_justify",
    "format_align_left",
    "format_align_right",
    "format_bold",
    "format_clear",
    "format_color_fill",
    "format_color_reset",
    "format_color_text",
    "format_indent_decrease",
    "format_indent_increase",
    "format_italic",
    "format_line_spacing",
    "format_list_bulleted",
    "format_list_numbered",
    "format_paint",
    "format_quote",
    "format_shapes",
    "format_size",
    "format_strikethrough",
    "format_textdirection_l_to_r",
    "format_textdirection_r_to_l",
    "format_underlined",
    "forum",
    "forward",
    "forward_10",
    "forward_30",
    "forward_5",
    "free_breakfast",
    "fullscreen",
    "fullscreen_exit",
    "functions",
    "g_translate",
    "gamepad",
    "games",
    "gavel",
    "gesture",
    "get_app",
    "gif",
    "golf_course",
    "gps_fixed",
    "gps_not_fixed",
    "gps_off",
    "grade",
    "gradient",
    "grain",
    "graphic_eq",
    "grid_off",
    "grid_on",
    "group",
    "group_add",
    "group_work",
    "hd",
    "hdr_off",
    "hdr_on",
    "hdr_strong",
    "hdr_weak",
    "headset",
    "headset_mic",
    "healing",
    "hearing",
    "help",
    "help_outline",
    "high_quality",
    "highlight",
    "highlight_off",
    "history",
    "home",
    "hot_tub",
    "hotel",
    "hourglass_empty",
    "hourglass_full",
    "http",
    "https",
    "image",
    "image_aspect_ratio",
    "import_contacts",
    "import_export",
    "important_devices",
    "inbox",
    "indeterminate_check_box",
    "info",
    "info_outline",
    "input",
    "insert_chart",
    "insert_comment",
    "insert_drive_file",
    "insert_emoticon",
    "insert_invitation",
    "insert_link",
    "insert_photo",
    "invert_colors",
    "invert_colors_off",
    "iso",
    "keyboard",
    "keyboard_arrow_down",
    "keyboard_arrow_left",
    "keyboard_arrow_right",
    "keyboard_arrow_up",
    "keyboard_backspace",
    "keyboard_capslock",
    "keyboard_hide",
    "keyboard_return",
    "keyboard_tab",
    "keyboard_voice",
    "kitchen",
    "label",
    "label_outline",
    "landscape",
    "language",
    "laptop",
    "laptop_chromebook",
    "laptop_mac",
    "laptop_windows",
    "last_page",
    "launch",
    "layers",
    "layers_clear",
    "leak_add",
    "leak_remove",
    "lens",
    "library_add",
    "library_books",
    "library_music",
    "lightbulb_outline",
    "line_style",
    "line_weight",
    "linear_scale",
    "link",
    "linked_camera",
    "list",
    "live_help",
    "live_tv",
    "local_activity",
    "local_airport",
    "local_atm",
    "local_bar",
    "local_cafe",
    "local_car_wash",
    "local_convenience_store",
    "local_dining",
    "local_drink",
    "local_florist",
    "local_gas_station",
    "local_grocery_store",
    "local_hospital",
    "local_hotel",
    "local_laundry_service",
    "local_library",
    "local_mall",
    "local_movies",
    "local_offer",
    "local_parking",
    "local_pharmacy",
    "local_phone",
    "local_pizza",
    "local_play",
    "local_post_office",
    "local_printshop",
    "local_see",
    "local_shipping",
    "local_taxi",
    "location_city",
    "location_disabled",
    "location_off",
    "location_on",
    "location_searching",
    "lock",
    "lock_open",
    "lock_outline",
    "looks",
    "looks_3",
    "looks_4",
    "looks_5",
    "looks_6",
    "looks_one",
    "looks_two",
    "loop",
    "loupe",
    "low_priority",
    "loyalty",
    "mail",
    "mail_outline",
    "map",
    "markunread",
    "markunread_mailbox",
    "memory",
    "menu",
    "merge_type",
    "message",
    "mic",
    "mic_none",
    "mic_off",
    "mms",
    "mode_comment",
    "mode_edit",
    "monetization_on",
    "money_off",
    "monochrome_photos",
    "mood",
    "mood_bad",
    "more",
    "more_horiz",
    "more_vert",
    "motorcycle",
    "mouse",
    "move_to_inbox",
    "movie",
    "movie_creation",
    "movie_filter",
    "multiline_chart",
    "music_note",
    "music_video",
    "my_location",
    "nature",
    "nature_people",
    "navigate_before",
    "navigate_next",
    "navigation",
    "near_me",
    "network_cell",
    "network_check",
    "network_locked",
    "network_wifi",
    "new_releases",
    "next_week",
    "nfc",
    "no_encryption",
    "no_sim",
    "not_interested",
    "note",
    "note_add",
    "notifications",
    "notifications_active",
    "notifications_none",
    "notifications_off",
    "notifications_paused",
    "offline_pin",
    "ondemand_video",
    "opacity",
    "open_in_browser",
    "open_in_new",
    "open_with",
    "pages",
    "pageview",
    "palette",
    "pan_tool",
    "panorama",
    "panorama_fish_eye",
    "panorama_horizontal",
    "panorama_vertical",
    "panorama_wide_angle",
    "party_mode",
    "pause",
    "pause_circle_filled",
    "pause_circle_outline",
    "payment",
    "people",
    "people_outline",
    "perm_camera_mic",
    "perm_contact_calendar",
    "perm_data_setting",
    "perm_device_information",
    "perm_identity",
    "perm_media",
    "perm_phone_msg",
    "perm_scan_wifi",
    "person",
    "person_add",
    "person_outline",
    "person_pin",
    "person_pin_circle",
    "personal_video",
    "pets",
    "phone",
    "phone_android",
    "phone_bluetooth_speaker",
    "phone_forwarded",
    "phone_in_talk",
    "phone_iphone",
    "phone_locked",
    "phone_missed",
    "phone_paused",
    "phonelink",
    "phonelink_erase",
    "phonelink_lock",
    "phonelink_off",
    "phonelink_ring",
    "phonelink_setup",
    "photo",
    "photo_album",
    "photo_camera",
    "photo_filter",
    "photo_library",
    "photo_size_select_actual",
    "photo_size_select_large",
    "photo_size_select_small",
    "picture_as_pdf",
    "picture_in_picture",
    "picture_in_picture_alt",
    "pie_chart",
    "pie_chart_outlined",
    "pin_drop",
    "place",
    "play_arrow",
    "play_circle_filled",
    "play_circle_outline",
    "play_for_work",
    "playlist_add",
    "playlist_add_check",
    "playlist_play",
    "plus_one",
    "poll",
    "polymer",
    "pool",
    "portable_wifi_off",
    "portrait",
    "power",
    "power_input",
    "power_settings_new",
    "pregnant_woman",
    "present_to_all",
    "print",
    "priority_high",
    "public",
    "publish",
    "query_builder",
    "question_answer",
    "queue",
    "queue_music",
    "queue_play_next",
    "radio",
    "radio_button_checked",
    "radio_button_unchecked",
    "rate_review",
    "receipt",
    "recent_actors",
    "record_voice_over",
    "redeem",
    "redo",
    "refresh",
    "remove",
    "remove_circle",
    "remove_circle_outline",
    "remove_from_queue",
    "remove_red_eye",
    "remove_shopping_cart",
    "reorder",
    "repeat",
    "repeat_one",
    "replay",
    "replay_10",
    "replay_30",
    "replay_5",
    "reply",
    "reply_all",
    "report",
    "report_problem",
    "restaurant",
    "restaurant_menu",
    "restore",
    "restore_page",
    "ring_volume",
    "room",
    "room_service",
    "rotate_90_degrees_ccw",
    "rotate_left",
    "rotate_right",
    "rounded_corner",
    "router",
    "rowing",
    "rss_feed",
    "rv_hookup",
    "satellite",
    "save",
    "scanner",
    "schedule",
    "school",
    "screen_lock_landscape",
    "screen_lock_portrait",
    "screen_lock_rotation",
    "screen_rotation",
    "screen_share",
    "sd_card",
    "sd_storage",
    "search",
    "security",
    "select_all",
    "send",
    "sentiment_dissatisfied",
    "sentiment_neutral",
    "sentiment_satisfied",
    "sentiment_very_dissatisfied",
    "sentiment_very_satisfied",
    "settings",
    "settings_applications",
    "settings_backup_restore",
    "settings_bluetooth",
    "settings_brightness",
    "settings_cell",
    "settings_ethernet",
    "settings_input_antenna",
    "settings_input_component",
    "settings_input_composite",
    "settings_input_hdmi",
    "settings_input_svideo",
    "settings_overscan",
    "settings_phone",
    "settings_power",
    "settings_remote",
    "settings_system_daydream",
    "settings_voice",
    "share",
    "shop",
    "shop_two",
    "shopping_basket",
    "shopping_cart",
    "short_text",
    "show_chart",
    "shuffle",
    "signal_cellular_4_bar",
    "signal_cellular_connected_no_internet_4_bar",
    "signal_cellular_no_sim",
    "signal_cellular_null",
    "signal_cellular_off",
    "signal_wifi_4_bar",
    "signal_wifi_4_bar_lock",
    "signal_wifi_off",
    "sim_card",
    "sim_card_alert",
    "skip_next",
    "skip_previous",
    "slideshow",
    "slow_motion_video",
    "smartphone",
    "smoke_free",
    "smoking_rooms",
    "sms",
    "sms_failed",
    "snooze",
    "sort",
    "sort_by_alpha",
    "spa",
    "space_bar",
    "speaker",
    "speaker_group",
    "speaker_notes",
    "speaker_notes_off",
    "speaker_phone",
    "spellcheck",
    "star",
    "star_border",
    "star_half",
    "stars",
    "stay_current_landscape",
    "stay_current_portrait",
    "stay_primary_landscape",
    "stay_primary_portrait",
    "stop",
    "stop_screen_share",
    "storage",
    "store",
    "store_mall_directory",
    "straighten",
    "streetview",
    "strikethrough_s",
    "style",
    "subdirectory_arrow_left",
    "subdirectory_arrow_right",
    "subject",
    "subscriptions",
    "subtitles",
    "subway",
    "supervisor_account",
    "surround_sound",
    "swap_calls",
    "swap_horiz",
    "swap_vert",
    "swap_vertical_circle",
    "switch_camera",
    "switch_video",
    "sync",
    "sync_disabled",
    "sync_problem",
    "system_update",
    "system_update_alt",
    "tab",
    "tab_unselected",
    "tablet",
    "tablet_android",
    "tablet_mac",
    "tag_faces",
    "tap_and_play",
    "terrain",
    "text_fields",
    "text_format",
    "textsms",
    "texture",
    "theaters",
    "thumb_down",
    "thumb_up",
    "thumbs_up_down",
    "time_to_leave",
    "timelapse",
    "timeline",
    "timer",
    "timer_10",
    "timer_3",
    "timer_off",
    "title",
    "toc",
    "today",
    "toll",
    "tonality",
    "touch_app",
    "toys",
    "track_changes",
    "traffic",
    "train",
    "tram",
    "transfer_within_a_station",
    "transform",
    "translate",
    "trending_down",
    "trending_flat",
    "trending_up",
    "tune",
    "turned_in",
    "turned_in_not",
    "tv",
    "unarchive",
    "undo",
    "unfold_less",
    "unfold_more",
    "update",
    "usb",
    "verified_user",
    "vertical_align_bottom",
    "vertical_align_center",
    "vertical_align_top",
    "vibration",
    "video_call",
    "video_label",
    "video_library",
    "videocam",
    "videocam_off",
    "videogame_asset",
    "view_agenda",
    "view_array",
    "view_carousel",
    "view_column",
    "view_comfy",
    "view_compact",
    "view_day",
    "view_headline",
    "view_list",
    "view_module",
    "view_quilt",
    "view_stream",
    "view_week",
    "vignette",
    "visibility",
    "visibility_off",
    "voice_chat",
    "voicemail",
    "volume_down",
    "volume_mute",
    "volume_off",
    "volume_up",
    "vpn_key",
    "vpn_lock",
    "wallpaper",
    "warning",
    "watch",
    "watch_later",
    "wb_auto",
    "wb_cloudy",
    "wb_incandescent",
    "wb_iridescent",
    "wb_sunny",
    "wc",
    "web",
    "web_asset",
    "weekend",
    "whatshot",
    "widgets",
    "wifi",
    "wifi_lock",
    "wifi_tethering",
    "work",
    "wrap_text",
    "youtube_searched_for",
    "zoom_in",
    "zoom_out",
    "zoom_out_map",
    //  https://github.com/FortAwesome/Font-Awesome/blob/master/svg-with-js/js/fontawesome-all.js
    "fa-address-book",
    "fa-address-card",
    "fa-angry",
    "fa-arrow-alt-circle-down",
    "fa-arrow-alt-circle-left",
    "fa-arrow-alt-circle-right",
    "fa-arrow-alt-circle-up",
    "fa-bell",
    "fa-bell-slash",
    "fa-bookmark",
    "fa-building",
    "fa-calendar",
    "fa-calendar-alt",
    "fa-calendar-check",
    "fa-calendar-minus",
    "fa-calendar-plus",
    "fa-calendar-times",
    "fa-caret-square-down",
    "fa-caret-square-left",
    "fa-caret-square-right",
    "fa-caret-square-up",
    "fa-chart-bar",
    "fa-check-circle",
    "fa-check-square",
    "fa-circle",
    "fa-clipboard",
    "fa-clock",
    "fa-clone",
    "fa-closed-captioning",
    "fa-comment",
    "fa-comment-alt",
    "fa-comment-dots",
    "fa-comments",
    "fa-compass",
    "fa-copy",
    "fa-copyright",
    "fa-credit-card",
    "fa-dizzy",
    "fa-dot-circle",
    "fa-edit",
    "fa-envelope",
    "fa-envelope-open",
    "fa-eye",
    "fa-eye-slash",
    "fa-file",
    "fa-file-alt",
    "fa-file-archive",
    "fa-file-audio",
    "fa-file-code",
    "fa-file-excel",
    "fa-file-image",
    "fa-file-pdf",
    "fa-file-powerpoint",
    "fa-file-video",
    "fa-file-word",
    "fa-flag",
    "fa-flushed",
    "fa-folder",
    "fa-folder-open",
    "fa-font-awesome-logo-full",
    "fa-frown",
    "fa-frown-open",
    "fa-futbol",
    "fa-gem",
    "fa-grimace",
    "fa-grin",
    "fa-grin-alt",
    "fa-grin-beam",
    "fa-grin-beam-sweat",
    "fa-grin-hearts",
    "fa-grin-squint",
    "fa-grin-squint-tears",
    "fa-grin-stars",
    "fa-grin-tears",
    "fa-grin-tongue",
    "fa-grin-tongue-squint",
    "fa-grin-tongue-wink",
    "fa-grin-wink",
    "fa-hand-lizard",
    "fa-hand-paper",
    "fa-hand-peace",
    "fa-hand-point-down",
    "fa-hand-point-left",
    "fa-hand-point-right",
    "fa-hand-point-up",
    "fa-hand-pointer",
    "fa-hand-rock",
    "fa-hand-scissors",
    "fa-hand-spock",
    "fa-handshake",
    "fa-hdd",
    "fa-heart",
    "fa-hospital",
    "fa-hourglass",
    "fa-id-badge",
    "fa-id-card",
    "fa-image",
    "fa-images",
    "fa-keyboard",
    "fa-kiss",
    "fa-kiss-beam",
    "fa-kiss-wink-heart",
    "fa-laugh",
    "fa-laugh-beam",
    "fa-laugh-squint",
    "fa-laugh-wink",
    "fa-lemon",
    "fa-life-ring",
    "fa-lightbulb",
    "fa-list-alt",
    "fa-map",
    "fa-meh",
    "fa-meh-blank",
    "fa-meh-rolling-eyes",
    "fa-minus-square",
    "fa-money-bill-alt",
    "fa-moon",
    "fa-newspaper",
    "fa-object-group",
    "fa-object-ungroup",
    "fa-paper-plane",
    "fa-pause-circle",
    "fa-play-circle",
    "fa-plus-square",
    "fa-question-circle",
    "fa-registered",
    "fa-sad-cry",
    "fa-sad-tear",
    "fa-save",
    "fa-share-square",
    "fa-smile",
    "fa-smile-beam",
    "fa-smile-wink",
    "fa-snowflake",
    "fa-square",
    "fa-star",
    "fa-star-half",
    "fa-sticky-note",
    "fa-stop-circle",
    "fa-sun",
    "fa-surprise",
    "fa-thumbs-down",
    "fa-thumbs-up",
    "fa-times-circle",
    "fa-tired",
    "fa-trash-alt",
    "fa-user",
    "fa-user-circle",
    "fa-window-close",
    "fa-window-maximize",
    "fa-window-minimize",
    "fa-window-restore",
    "fa-ad",
    "fa-address-book",
    "fa-address-card",
    "fa-adjust",
    "fa-air-freshener",
    "fa-align-center",
    "fa-align-justify",
    "fa-align-left",
    "fa-align-right",
    "fa-allergies",
    "fa-ambulance",
    "fa-american-sign-language-interpreting",
    "fa-anchor",
    "fa-angle-double-down",
    "fa-angle-double-left",
    "fa-angle-double-right",
    "fa-angle-double-up",
    "fa-angle-down",
    "fa-angle-left",
    "fa-angle-right",
    "fa-angle-up",
    "fa-angry",
    "fa-ankh",
    "fa-apple-alt",
    "fa-archive",
    "fa-archway",
    "fa-arrow-alt-circle-down",
    "fa-arrow-alt-circle-left",
    "fa-arrow-alt-circle-right",
    "fa-arrow-alt-circle-up",
    "fa-arrow-circle-down",
    "fa-arrow-circle-left",
    "fa-arrow-circle-right",
    "fa-arrow-circle-up",
    "fa-arrow-down",
    "fa-arrow-left",
    "fa-arrow-right",
    "fa-arrow-up",
    "fa-arrows-alt",
    "fa-arrows-alt-h",
    "fa-arrows-alt-v",
    "fa-assistive-listening-systems",
    "fa-asterisk",
    "fa-at",
    "fa-atlas",
    "fa-atom",
    "fa-audio-description",
    "fa-award",
    "fa-backspace",
    "fa-backward",
    "fa-balance-scale",
    "fa-ban",
    "fa-band-aid",
    "fa-barcode",
    "fa-bars",
    "fa-baseball-ball",
    "fa-basketball-ball",
    "fa-bath",
    "fa-battery-empty",
    "fa-battery-full",
    "fa-battery-half",
    "fa-battery-quarter",
    "fa-battery-three-quarters",
    "fa-bed",
    "fa-beer",
    "fa-bell",
    "fa-bell-slash",
    "fa-bezier-curve",
    "fa-bible",
    "fa-bicycle",
    "fa-binoculars",
    "fa-birthday-cake",
    "fa-blender",
    "fa-blind",
    "fa-bold",
    "fa-bolt",
    "fa-bomb",
    "fa-bone",
    "fa-bong",
    "fa-book",
    "fa-book-open",
    "fa-book-reader",
    "fa-bookmark",
    "fa-bowling-ball",
    "fa-box",
    "fa-box-open",
    "fa-boxes",
    "fa-braille",
    "fa-brain",
    "fa-briefcase",
    "fa-briefcase-medical",
    "fa-broadcast-tower",
    "fa-broom",
    "fa-brush",
    "fa-bug",
    "fa-building",
    "fa-bullhorn",
    "fa-bullseye",
    "fa-burn",
    "fa-bus",
    "fa-bus-alt",
    "fa-business-time",
    "fa-calculator",
    "fa-calendar",
    "fa-calendar-alt",
    "fa-calendar-check",
    "fa-calendar-minus",
    "fa-calendar-plus",
    "fa-calendar-times",
    "fa-camera",
    "fa-camera-retro",
    "fa-cannabis",
    "fa-capsules",
    "fa-car",
    "fa-car-alt",
    "fa-car-battery",
    "fa-car-crash",
    "fa-car-side",
    "fa-caret-down",
    "fa-caret-left",
    "fa-caret-right",
    "fa-caret-square-down",
    "fa-caret-square-left",
    "fa-caret-square-right",
    "fa-caret-square-up",
    "fa-caret-up",
    "fa-cart-arrow-down",
    "fa-cart-plus",
    "fa-certificate",
    "fa-chalkboard",
    "fa-chalkboard-teacher",
    "fa-charging-station",
    "fa-chart-area",
    "fa-chart-bar",
    "fa-chart-line",
    "fa-chart-pie",
    "fa-check",
    "fa-check-circle",
    "fa-check-double",
    "fa-check-square",
    "fa-chess",
    "fa-chess-bishop",
    "fa-chess-board",
    "fa-chess-king",
    "fa-chess-knight",
    "fa-chess-pawn",
    "fa-chess-queen",
    "fa-chess-rook",
    "fa-chevron-circle-down",
    "fa-chevron-circle-left",
    "fa-chevron-circle-right",
    "fa-chevron-circle-up",
    "fa-chevron-down",
    "fa-chevron-left",
    "fa-chevron-right",
    "fa-chevron-up",
    "fa-child",
    "fa-church",
    "fa-circle",
    "fa-circle-notch",
    "fa-city",
    "fa-clipboard",
    "fa-clipboard-check",
    "fa-clipboard-list",
    "fa-clock",
    "fa-clone",
    "fa-closed-captioning",
    "fa-cloud",
    "fa-cloud-download-alt",
    "fa-cloud-upload-alt",
    "fa-cocktail",
    "fa-code",
    "fa-code-branch",
    "fa-coffee",
    "fa-cog",
    "fa-cogs",
    "fa-coins",
    "fa-columns",
    "fa-comment",
    "fa-comment-alt",
    "fa-comment-dollar",
    "fa-comment-dots",
    "fa-comment-slash",
    "fa-comments",
    "fa-comments-dollar",
    "fa-compact-disc",
    "fa-compass",
    "fa-compress",
    "fa-concierge-bell",
    "fa-cookie",
    "fa-cookie-bite",
    "fa-copy",
    "fa-copyright",
    "fa-couch",
    "fa-credit-card",
    "fa-crop",
    "fa-crop-alt",
    "fa-cross",
    "fa-crosshairs",
    "fa-crow",
    "fa-crown",
    "fa-cube",
    "fa-cubes",
    "fa-cut",
    "fa-database",
    "fa-deaf",
    "fa-desktop",
    "fa-dharmachakra",
    "fa-diagnoses",
    "fa-dice",
    "fa-dice-five",
    "fa-dice-four",
    "fa-dice-one",
    "fa-dice-six",
    "fa-dice-three",
    "fa-dice-two",
    "fa-digital-tachograph",
    "fa-directions",
    "fa-divide",
    "fa-dizzy",
    "fa-dna",
    "fa-dollar-sign",
    "fa-dolly",
    "fa-dolly-flatbed",
    "fa-donate",
    "fa-door-closed",
    "fa-door-open",
    "fa-dot-circle",
    "fa-dove",
    "fa-download",
    "fa-drafting-compass",
    "fa-draw-polygon",
    "fa-drum",
    "fa-drum-steelpan",
    "fa-dumbbell",
    "fa-edit",
    "fa-eject",
    "fa-ellipsis-h",
    "fa-ellipsis-v",
    "fa-envelope",
    "fa-envelope-open",
    "fa-envelope-open-text",
    "fa-envelope-square",
    "fa-equals",
    "fa-eraser",
    "fa-euro-sign",
    "fa-exchange-alt",
    "fa-exclamation",
    "fa-exclamation-circle",
    "fa-exclamation-triangle",
    "fa-expand",
    "fa-expand-arrows-alt",
    "fa-external-link-alt",
    "fa-external-link-square-alt",
    "fa-eye",
    "fa-eye-dropper",
    "fa-eye-slash",
    "fa-fast-backward",
    "fa-fast-forward",
    "fa-fax",
    "fa-feather",
    "fa-feather-alt",
    "fa-female",
    "fa-fighter-jet",
    "fa-file",
    "fa-file-alt",
    "fa-file-archive",
    "fa-file-audio",
    "fa-file-code",
    "fa-file-contract",
    "fa-file-download",
    "fa-file-excel",
    "fa-file-export",
    "fa-file-image",
    "fa-file-import",
    "fa-file-invoice",
    "fa-file-invoice-dollar",
    "fa-file-medical",
    "fa-file-medical-alt",
    "fa-file-pdf",
    "fa-file-powerpoint",
    "fa-file-prescription",
    "fa-file-signature",
    "fa-file-upload",
    "fa-file-video",
    "fa-file-word",
    "fa-fill",
    "fa-fill-drip",
    "fa-film",
    "fa-filter",
    "fa-fingerprint",
    "fa-fire",
    "fa-fire-extinguisher",
    "fa-first-aid",
    "fa-fish",
    "fa-flag",
    "fa-flag-checkered",
    "fa-flask",
    "fa-flushed",
    "fa-folder",
    "fa-folder-minus",
    "fa-folder-open",
    "fa-folder-plus",
    "fa-font",
    "fa-font-awesome-logo-full",
    "fa-football-ball",
    "fa-forward",
    "fa-frog",
    "fa-frown",
    "fa-frown-open",
    "fa-funnel-dollar",
    "fa-futbol",
    "fa-gamepad",
    "fa-gas-pump",
    "fa-gavel",
    "fa-gem",
    "fa-genderless",
    "fa-gift",
    "fa-glass-martini",
    "fa-glass-martini-alt",
    "fa-glasses",
    "fa-globe",
    "fa-globe-africa",
    "fa-globe-americas",
    "fa-globe-asia",
    "fa-golf-ball",
    "fa-gopuram",
    "fa-graduation-cap",
    "fa-greater-than",
    "fa-greater-than-equal",
    "fa-grimace",
    "fa-grin",
    "fa-grin-alt",
    "fa-grin-beam",
    "fa-grin-beam-sweat",
    "fa-grin-hearts",
    "fa-grin-squint",
    "fa-grin-squint-tears",
    "fa-grin-stars",
    "fa-grin-tears",
    "fa-grin-tongue",
    "fa-grin-tongue-squint",
    "fa-grin-tongue-wink",
    "fa-grin-wink",
    "fa-grip-horizontal",
    "fa-grip-vertical",
    "fa-h-square",
    "fa-hamsa",
    "fa-hand-holding",
    "fa-hand-holding-heart",
    "fa-hand-holding-usd",
    "fa-hand-lizard",
    "fa-hand-paper",
    "fa-hand-peace",
    "fa-hand-point-down",
    "fa-hand-point-left",
    "fa-hand-point-right",
    "fa-hand-point-up",
    "fa-hand-pointer",
    "fa-hand-rock",
    "fa-hand-scissors",
    "fa-hand-spock",
    "fa-hands",
    "fa-hands-helping",
    "fa-handshake",
    "fa-hashtag",
    "fa-haykal",
    "fa-hdd",
    "fa-heading",
    "fa-headphones",
    "fa-headphones-alt",
    "fa-headset",
    "fa-heart",
    "fa-heartbeat",
    "fa-helicopter",
    "fa-highlighter",
    "fa-history",
    "fa-hockey-puck",
    "fa-home",
    "fa-hospital",
    "fa-hospital-alt",
    "fa-hospital-symbol",
    "fa-hot-tub",
    "fa-hotel",
    "fa-hourglass",
    "fa-hourglass-end",
    "fa-hourglass-half",
    "fa-hourglass-start",
    "fa-i-cursor",
    "fa-id-badge",
    "fa-id-card",
    "fa-id-card-alt",
    "fa-image",
    "fa-images",
    "fa-inbox",
    "fa-indent",
    "fa-industry",
    "fa-infinity",
    "fa-info",
    "fa-info-circle",
    "fa-italic",
    "fa-jedi",
    "fa-joint",
    "fa-journal-whills",
    "fa-kaaba",
    "fa-key",
    "fa-keyboard",
    "fa-khanda",
    "fa-kiss",
    "fa-kiss-beam",
    "fa-kiss-wink-heart",
    "fa-kiwi-bird",
    "fa-landmark",
    "fa-language",
    "fa-laptop",
    "fa-laptop-code",
    "fa-laugh",
    "fa-laugh-beam",
    "fa-laugh-squint",
    "fa-laugh-wink",
    "fa-layer-group",
    "fa-leaf",
    "fa-lemon",
    "fa-less-than",
    "fa-less-than-equal",
    "fa-level-down-alt",
    "fa-level-up-alt",
    "fa-life-ring",
    "fa-lightbulb",
    "fa-link",
    "fa-lira-sign",
    "fa-list",
    "fa-list-alt",
    "fa-list-ol",
    "fa-list-ul",
    "fa-location-arrow",
    "fa-lock",
    "fa-lock-open",
    "fa-long-arrow-alt-down",
    "fa-long-arrow-alt-left",
    "fa-long-arrow-alt-right",
    "fa-long-arrow-alt-up",
    "fa-low-vision",
    "fa-luggage-cart",
    "fa-magic",
    "fa-magnet",
    "fa-mail-bulk",
    "fa-male",
    "fa-map",
    "fa-map-marked",
    "fa-map-marked-alt",
    "fa-map-marker",
    "fa-map-marker-alt",
    "fa-map-pin",
    "fa-map-signs",
    "fa-marker",
    "fa-mars",
    "fa-mars-double",
    "fa-mars-stroke",
    "fa-mars-stroke-h",
    "fa-mars-stroke-v",
    "fa-medal",
    "fa-medkit",
    "fa-meh",
    "fa-meh-blank",
    "fa-meh-rolling-eyes",
    "fa-memory",
    "fa-menorah",
    "fa-mercury",
    "fa-microchip",
    "fa-microphone",
    "fa-microphone-alt",
    "fa-microphone-alt-slash",
    "fa-microphone-slash",
    "fa-microscope",
    "fa-minus",
    "fa-minus-circle",
    "fa-minus-square",
    "fa-mobile",
    "fa-mobile-alt",
    "fa-money-bill",
    "fa-money-bill-alt",
    "fa-money-bill-wave",
    "fa-money-bill-wave-alt",
    "fa-money-check",
    "fa-money-check-alt",
    "fa-monument",
    "fa-moon",
    "fa-mortar-pestle",
    "fa-mosque",
    "fa-motorcycle",
    "fa-mouse-pointer",
    "fa-music",
    "fa-neuter",
    "fa-newspaper",
    "fa-not-equal",
    "fa-notes-medical",
    "fa-object-group",
    "fa-object-ungroup",
    "fa-oil-can",
    "fa-om",
    "fa-outdent",
    "fa-paint-brush",
    "fa-paint-roller",
    "fa-palette",
    "fa-pallet",
    "fa-paper-plane",
    "fa-paperclip",
    "fa-parachute-box",
    "fa-paragraph",
    "fa-parking",
    "fa-passport",
    "fa-pastafarianism",
    "fa-paste",
    "fa-pause",
    "fa-pause-circle",
    "fa-paw",
    "fa-peace",
    "fa-pen",
    "fa-pen-alt",
    "fa-pen-fancy",
    "fa-pen-nib",
    "fa-pen-square",
    "fa-pencil-alt",
    "fa-pencil-ruler",
    "fa-people-carry",
    "fa-percent",
    "fa-percentage",
    "fa-phone",
    "fa-phone-slash",
    "fa-phone-square",
    "fa-phone-volume",
    "fa-piggy-bank",
    "fa-pills",
    "fa-place-of-worship",
    "fa-plane",
    "fa-plane-arrival",
    "fa-plane-departure",
    "fa-play",
    "fa-play-circle",
    "fa-plug",
    "fa-plus",
    "fa-plus-circle",
    "fa-plus-square",
    "fa-podcast",
    "fa-poll",
    "fa-poll-h",
    "fa-poo",
    "fa-poop",
    "fa-portrait",
    "fa-pound-sign",
    "fa-power-off",
    "fa-pray",
    "fa-praying-hands",
    "fa-prescription",
    "fa-prescription-bottle",
    "fa-prescription-bottle-alt",
    "fa-print",
    "fa-procedures",
    "fa-project-diagram",
    "fa-puzzle-piece",
    "fa-qrcode",
    "fa-question",
    "fa-question-circle",
    "fa-quidditch",
    "fa-quote-left",
    "fa-quote-right",
    "fa-quran",
    "fa-random",
    "fa-receipt",
    "fa-recycle",
    "fa-redo",
    "fa-redo-alt",
    "fa-registered",
    "fa-reply",
    "fa-reply-all",
    "fa-retweet",
    "fa-ribbon",
    "fa-road",
    "fa-robot",
    "fa-rocket",
    "fa-route",
    "fa-rss",
    "fa-rss-square",
    "fa-ruble-sign",
    "fa-ruler",
    "fa-ruler-combined",
    "fa-ruler-horizontal",
    "fa-ruler-vertical",
    "fa-rupee-sign",
    "fa-sad-cry",
    "fa-sad-tear",
    "fa-save",
    "fa-school",
    "fa-screwdriver",
    "fa-search",
    "fa-search-dollar",
    "fa-search-location",
    "fa-search-minus",
    "fa-search-plus",
    "fa-seedling",
    "fa-server",
    "fa-shapes",
    "fa-share",
    "fa-share-alt",
    "fa-share-alt-square",
    "fa-share-square",
    "fa-shekel-sign",
    "fa-shield-alt",
    "fa-ship",
    "fa-shipping-fast",
    "fa-shoe-prints",
    "fa-shopping-bag",
    "fa-shopping-basket",
    "fa-shopping-cart",
    "fa-shower",
    "fa-shuttle-van",
    "fa-sign",
    "fa-sign-in-alt",
    "fa-sign-language",
    "fa-sign-out-alt",
    "fa-signal",
    "fa-signature",
    "fa-sitemap",
    "fa-skull",
    "fa-sliders-h",
    "fa-smile",
    "fa-smile-beam",
    "fa-smile-wink",
    "fa-smoking",
    "fa-smoking-ban",
    "fa-snowflake",
    "fa-socks",
    "fa-solar-panel",
    "fa-sort",
    "fa-sort-alpha-down",
    "fa-sort-alpha-up",
    "fa-sort-amount-down",
    "fa-sort-amount-up",
    "fa-sort-down",
    "fa-sort-numeric-down",
    "fa-sort-numeric-up",
    "fa-sort-up",
    "fa-spa",
    "fa-space-shuttle",
    "fa-spinner",
    "fa-splotch",
    "fa-spray-can",
    "fa-square",
    "fa-square-full",
    "fa-square-root-alt",
    "fa-stamp",
    "fa-star",
    "fa-star-and-crescent",
    "fa-star-half",
    "fa-star-half-alt",
    "fa-star-of-david",
    "fa-star-of-life",
    "fa-step-backward",
    "fa-step-forward",
    "fa-stethoscope",
    "fa-sticky-note",
    "fa-stop",
    "fa-stop-circle",
    "fa-stopwatch",
    "fa-store",
    "fa-store-alt",
    "fa-stream",
    "fa-street-view",
    "fa-strikethrough",
    "fa-stroopwafel",
    "fa-subscript",
    "fa-subway",
    "fa-suitcase",
    "fa-suitcase-rolling",
    "fa-sun",
    "fa-superscript",
    "fa-surprise",
    "fa-swatchbook",
    "fa-swimmer",
    "fa-swimming-pool",
    "fa-synagogue",
    "fa-sync",
    "fa-sync-alt",
    "fa-syringe",
    "fa-table",
    "fa-table-tennis",
    "fa-tablet",
    "fa-tablet-alt",
    "fa-tablets",
    "fa-tachometer-alt",
    "fa-tag",
    "fa-tags",
    "fa-tape",
    "fa-tasks",
    "fa-taxi",
    "fa-teeth",
    "fa-teeth-open",
    "fa-terminal",
    "fa-text-height",
    "fa-text-width",
    "fa-th",
    "fa-th-large",
    "fa-th-list",
    "fa-theater-masks",
    "fa-thermometer",
    "fa-thermometer-empty",
    "fa-thermometer-full",
    "fa-thermometer-half",
    "fa-thermometer-quarter",
    "fa-thermometer-three-quarters",
    "fa-thumbs-down",
    "fa-thumbs-up",
    "fa-thumbtack",
    "fa-ticket-alt",
    "fa-times",
    "fa-times-circle",
    "fa-tint",
    "fa-tint-slash",
    "fa-tired",
    "fa-toggle-off",
    "fa-toggle-on",
    "fa-toolbox",
    "fa-tooth",
    "fa-torah",
    "fa-torii-gate",
    "fa-trademark",
    "fa-traffic-light",
    "fa-train",
    "fa-transgender",
    "fa-transgender-alt",
    "fa-trash",
    "fa-trash-alt",
    "fa-tree",
    "fa-trophy",
    "fa-truck",
    "fa-truck-loading",
    "fa-truck-monster",
    "fa-truck-moving",
    "fa-truck-pickup",
    "fa-tshirt",
    "fa-tty",
    "fa-tv",
    "fa-umbrella",
    "fa-umbrella-beach",
    "fa-underline",
    "fa-undo",
    "fa-undo-alt",
    "fa-universal-access",
    "fa-university",
    "fa-unlink",
    "fa-unlock",
    "fa-unlock-alt",
    "fa-upload",
    "fa-user",
    "fa-user-alt",
    "fa-user-alt-slash",
    "fa-user-astronaut",
    "fa-user-check",
    "fa-user-circle",
    "fa-user-clock",
    "fa-user-cog",
    "fa-user-edit",
    "fa-user-friends",
    "fa-user-graduate",
    "fa-user-lock",
    "fa-user-md",
    "fa-user-minus",
    "fa-user-ninja",
    "fa-user-plus",
    "fa-user-secret",
    "fa-user-shield",
    "fa-user-slash",
    "fa-user-tag",
    "fa-user-tie",
    "fa-user-times",
    "fa-users",
    "fa-users-cog",
    "fa-utensil-spoon",
    "fa-utensils",
    "fa-vector-square",
    "fa-venus",
    "fa-venus-double",
    "fa-venus-mars",
    "fa-vial",
    "fa-vials",
    "fa-video",
    "fa-video-slash",
    "fa-vihara",
    "fa-volleyball-ball",
    "fa-volume-down",
    "fa-volume-off",
    "fa-volume-up",
    "fa-walking",
    "fa-wallet",
    "fa-warehouse",
    "fa-weight",
    "fa-weight-hanging",
    "fa-wheelchair",
    "fa-wifi",
    "fa-window-close",
    "fa-window-maximize",
    "fa-window-minimize",
    "fa-window-restore",
    "fa-wine-glass",
    "fa-wine-glass-alt",
    "fa-won-sign",
    "fa-wrench",
    "fa-x-ray",
    "fa-yen-sign",
    "fa-yin-yang"
  )
}
