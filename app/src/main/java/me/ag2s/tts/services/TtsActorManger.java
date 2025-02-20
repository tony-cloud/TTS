package me.ag2s.tts.services;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TtsActorManger {
    private static final String TAG = "TtsActorManger";
    //单例

    private static TtsActorManger instance;

    public static TtsActorManger getInstance() {
        if (instance == null) {
            instance = new TtsActorManger();
        }
        return instance;
    }

    private final List<TtsActor> actors;

    private TtsActorManger() {
        actors = new ArrayList<>(180);
        //中文
        //zh-CN,云希,zh-CN-YunxiNeural,Male
        //zh-CN,云扬,zh-CN-YunyangNeural,Male
        //zh-CN,云野,zh-CN-YunyeNeural,Male
        //zh-CN,晓双,zh-CN-XiaoshuangNeural,Female
        //zh-CN,晓墨,zh-CN-XiaomoNeural,Female
        //zh-CN,晓悠,zh-CN-XiaoyouNeural,Female
        //zh-CN,晓晓,zh-CN-XiaoxiaoNeural,Female
        //zh-CN,晓涵,zh-CN-XiaohanNeural,Female
        //zh-CN,晓睿,zh-CN-XiaoruiNeural,Female
        //zh-CN,晓秋,zh-CN-XiaoqiuNeural,Female
        //zh-CN,晓萱,zh-CN-XiaoxuanNeural,Female
        //zh-CN,晓辰,zh-CN-XiaochenNeural,Female
        //zh-CN,晓颜,zh-CN-XiaoyanNeural,Female
        //zh-HK,曉佳,zh-HK-HiuGaaiNeural,Female
        //zh-HK,曉曼,zh-HK-HiuMaanNeural,Female
        //zh-HK,雲龍,zh-HK-WanLungNeural,Male
        //zh-TW,曉臻,zh-TW-HsiaoChenNeural,Female
        //zh-TW,曉雨,zh-TW-HsiaoYuNeural,Female
        //zh-TW,雲哲,zh-TW-YunJheNeural,Male

        actors.add(new TtsActor("晓晓", "zh-CN-XiaoxiaoNeural", "zh-CN", true, "晓晓(Xiaoxiao),常规，使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓悠", "zh-CN-XiaoyouNeural", "zh-CN", true, "晓悠(Xiaoyou),儿童语音，针对讲故事进行了优化"));
        actors.add(new TtsActor("云扬", "zh-CN-YunyangNeural", "zh-CN", false, "云扬(Yunyang),针对新闻阅读进行了优化，使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("云野", "zh-CN-YunyeNeural", "zh-CN", false, "云野(Yunye),针对讲故事进行了优化"));
        actors.add(new TtsActor("云希", "zh-CN-YunxiNeural", "zh-CN", false, "云希(Yunxi),使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓涵", "zh-CN-XiaohanNeural", "zh-CN", true, "晓涵(Xiaohan),使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓墨", "zh-CN-XiaomoNeural", "zh-CN", true, "使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓睿", "zh-CN-XiaoruiNeural", "zh-CN", true, "使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓萱", "zh-CN-XiaoxuanNeural", "zh-CN", true, "使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓辰", "zh-CN-XiaochenNeural", "zh-CN", true, "使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓秋", "zh-CN-XiaoqiuNeural", "zh-CN", true, "使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓双", "zh-CN-XiaoshuangNeural", "zh-CN", true, "使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("晓颜", "zh-CN-XiaoyanNeural", "zh-CN", true, "使用 SSML 提供多种语音风格"));


        actors.add(new TtsActor("曉佳", "zh-HK-HiuGaaiNeural", "zh-HK", true, "曉佳(HiuGaai),粤语女声"));
        actors.add(new TtsActor("曉曼", "zh-HK-HiuMaanNeural", "zh-HK", true, "曉曼(HiuMaan),粤语女声"));
        actors.add(new TtsActor("雲龍", "zh-HK-WanLungNeural", "zh-HK", false, "雲龍(WanLung),粤语男声"));
        //英语（中国香港特别行政区）
        //en-HK,Sam,en-HK-SamNeural,Male
        //en-HK,Yan,en-HK-YanNeural,Female
        actors.add(new TtsActor("Yan", "en-HK-YanNeural", "en-HK", true, "Yan,港式英语女声，不支持中文。"));
        actors.add(new TtsActor("Sam", "en-HK-SamNeural", "en-HK", false, "Sam,港式英语男声，不支持中文。"));


        actors.add(new TtsActor("曉臻", "zh-TW-HsiaoChenNeural", "zh-TW", true, "曉臻(HsiaoChen),湾湾女声"));
        actors.add(new TtsActor("曉雨", "zh-TW-HsiaoYuNeural", "zh-TW", true, "曉雨(HsiaoYu),湾湾女声"));
        actors.add(new TtsActor("雲哲", "zh-TW-YunJheNeural", "zh-TW", false, "雲哲(YunJhe),湾湾男声"));


        //日语（日本）
        //ja-JP,七海,ja-JP-NanamiNeural,Female
        //ja-JP,圭太,ja-JP-KeitaNeural,Male
        actors.add(new TtsActor("七海", "ja-JP-NanamiNeural", "ja-JP", true, "七海(Nanami),日语女声"));
        actors.add(new TtsActor("圭太", "ja-JP-KeitaNeural", "ja-JP", false, "圭太(Keita),日语男声"));

        //韩语（韩国）
        //ko-KR,선히,ko-KR-SunHiNeural,Female
        //ko-KR,인준,ko-KR-InJoonNeural,Male
        actors.add(new TtsActor("선히", "ko-KR-SunHiNeural", "ko-KR", true, "선히(SunHi),韩语女声"));
        actors.add(new TtsActor("인준", "ko-KR-InJoonNeural", "ko-KR", false, "인준(InJoon),韩语男声"));

        //美式英语
        //en-US,Amber,en-US-AmberNeural,Female
        //en-US,Ana,en-US-AnaNeural,Female
        //en-US,Aria,en-US-AriaNeural,Female
        //en-US,Ashley,en-US-AshleyNeural,Female
        //en-US,Brandon,en-US-BrandonNeural,Male
        //en-US,Christopher,en-US-ChristopherNeural,Male
        //en-US,Cora,en-US-CoraNeural,Female
        //en-US,Elizabeth,en-US-ElizabethNeural,Female
        //en-US,Eric,en-US-EricNeural,Male
        //en-US,Guy,en-US-GuyNeural,Male
        //en-US,Jacob,en-US-JacobNeural,Male
        //en-US,Jenny Multilingual,en-US-JennyMultilingualNeural,Female "de-DE,en-AU,en-CA,en-GB,es-ES,es-MX,fr-CA,fr-FR,it-IT,ja-JP,ko-KR,pt-BR,zh-CN"
        //en-US,Jenny,en-US-JennyNeural,Female
        //en-US,Michelle,en-US-MichelleNeural,Female
        //en-US,Monica,en-US-MonicaNeural,Female
        //en-US,Sara,en-US-SaraNeural,Female

        actors.add(new TtsActor("Jenny+", "en-US-JennyMultilingualNeural", "en-US", true, "多语言，支持中文，美式英语，成年女性"));
        actors.add(new TtsActor("Amber", "en-US-AmberNeural", "en-US", true, "美式英语，年轻女性"));
        actors.add(new TtsActor("Ana", "en-US-AnaNeural", "en-US", true, "美式英语，女童"));
        actors.add(new TtsActor("Aria", "en-US-AriaNeural", "en-US", true, "美式英语，成年女性"));
        actors.add(new TtsActor("Ashley", "en-US-AshleyNeural", "en-US", true, "美式英语，成年女性"));
        actors.add(new TtsActor("Cora", "en-US-CoraNeural", "en-US", true, "美式英语，成年女性"));
        actors.add(new TtsActor("Elizabeth", "en-US-ElizabethNeural", "en-US", true, "美式英语，成年女性"));
        actors.add(new TtsActor("Jenny", "en-US-JennyNeural", "en-US", true, "美式英语，成年女性"));
        actors.add(new TtsActor("Michelle", "en-US-MichelleNeural", "en-US", true, "美式英语，成年女性"));
        actors.add(new TtsActor("Monica", "en-US-MonicaNeural", "en-US", true, "美式英语，成年女性"));
        actors.add(new TtsActor("Sara", "en-US-SaraNeural", "en-US", true, "美式英语，成年女性"));

        actors.add(new TtsActor("Brandon", "en-US-BrandonNeural", "en-US", false, "美式英语，成年男性"));
        actors.add(new TtsActor("Christopher", "en-US-ChristopherNeural", "en-US", false, "美式英语，成年男性"));
        actors.add(new TtsActor("Eric", "en-US-EricNeural", "en-US", false, "美式英语，成年男性"));
        actors.add(new TtsActor("Guy", "en-US-GuyNeural", "en-US", false, "美式英语，成年男性"));
        actors.add(new TtsActor("Jacob", "en-US-JacobNeural", "en-US", false, "美式英语，成年男性"));


        //英式英语
        //en-GB,Libby,en-GB-LibbyNeural,Female
        //en-GB,Mia,en-GB-MiaNeural,Female
        //en-GB,Ryan,en-GB-RyanNeural,Male
        //en-GB,Sonia,en-GB-SoniaNeural,Female
        actors.add(new TtsActor("en-GB-LibbyNeural", true, "常规"));
        actors.add(new TtsActor("en-GB-MiaNeural", true, "常规"));
        actors.add(new TtsActor("en-GB-SoniaNeural", true, "常规"));
        actors.add(new TtsActor("en-GB-RyanNeural", false, "常规"));
        //英语（新加坡）
        //en-SG,Luna,en-SG-LunaNeural,Female
        //en-SG,Wayne,en-SG-WayneNeural,Male
        actors.add(new TtsActor("en-SG-LunaNeural", true, "常规"));
        actors.add(new TtsActor("en-SG-WayneNeural", false, "常规"));

        //英语（新西兰）
        //en-NZ,Mitchell,en-NZ-MitchellNeural,Male
        //en-NZ,Molly,en-NZ-MollyNeural,Female
        actors.add(new TtsActor("en-NZ-MollyNeural", true, "常规"));
        actors.add(new TtsActor("en-NZ-MitchellNeural", false, "常规"));

        //英语（南非）
        //en-ZA,Leah,en-ZA-LeahNeural,Female
        //en-ZA,Luke,en-ZA-LukeNeural,Male
        actors.add(new TtsActor("en-ZA-LeahNeural", true, "常规"));
        actors.add(new TtsActor("en-ZA-LukeNeural", false, "常规"));

        //英语（澳大利亚）
        //en-AU,Natasha,en-AU-NatashaNeural,Female
        //en-AU,William,en-AU-WilliamNeural,Male
        actors.add(new TtsActor("en-AU-NatashaNeural", true, "常规"));
        actors.add(new TtsActor("en-AU-WilliamNeural", false, "常规"));
        //英语（加拿大）
        //en-CA,Clara,en-CA-ClaraNeural,Female
        //en-CA,Liam,en-CA-LiamNeural,Male
        actors.add(new TtsActor("en-CA-ClaraNeural", true, "常规"));
        actors.add(new TtsActor("en-CA-LiamNeural", false, "常规"));
        //英语（印度）
        //en-IN,Neerja,en-IN-NeerjaNeural,Female
        //en-IN,Prabhat,en-IN-PrabhatNeural,Male
        actors.add(new TtsActor("en-IN-NeerjaNeural", true, "常规"));
        actors.add(new TtsActor("en-IN-PrabhatNeural", false, "常规"));
        //英语（爱尔兰）
        //en-IE,Connor,en-IE-ConnorNeural,Male
        //en-IE,Emily,en-IE-EmilyNeural,Female
        actors.add(new TtsActor("en-IE-EmilyNeural", true, "常规"));
        actors.add(new TtsActor("en-IE-ConnorNeural", false, "常规"));
        //英语（菲律宾）
        //en-PH,James,en-PH-JamesNeural,Male
        //en-PH,Rosa,en-PH-RosaNeural,Female
        actors.add(new TtsActor("en-PH-RosaNeural", true, "常规"));
        actors.add(new TtsActor("en-PH-JamesNeural", false, "常规"));


        //俄语（俄罗斯）
        //ru-RU	ru-RU,Дария,ru-RU-DariyaNeural,Female
        //ru-RU,Дмитрий,ru-RU-DmitryNeural,Male
        //ru-RU,Светлана,ru-RU-SvetlanaNeural,Female
        actors.add(new TtsActor("ru-RU-DariyaNeural", true, "常规"));
        actors.add(new TtsActor("ru-RU-SvetlanaNeural", true, "常规"));
        actors.add(new TtsActor("ru-RU-DmitryNeural", false, "常规"));


        //阿拉伯语（埃及）
        //ar-EG,سلمى,ar-EG-SalmaNeural,Female
        //ar-EG,شاكر,ar-EG-ShakirNeural,Male
        actors.add(new TtsActor("ar-EG-SalmaNeural", true, "常规"));
        actors.add(new TtsActor("ar-EG-ShakirNeural", false, "常规"));
        //阿拉伯语（沙特阿拉伯）
        //ar-SA,حامد,ar-SA-HamedNeural,Male
        //ar-SA,زارية,ar-SA-ZariyahNeural,Female
        actors.add(new TtsActor("ar-SA-ZariyahNeural", true, "常规"));
        actors.add(new TtsActor("ar-SA-HamedNeural", false, "常规"));
        //保加利亚语
        //bg-BG,Борислав,bg-BG-BorislavNeural,Male
        //bg-BG,Калина,bg-BG-KalinaNeural,Female
        actors.add(new TtsActor("bg-BG-KalinaNeural", true, "常规"));
        actors.add(new TtsActor("bg-BG-BorislavNeural", false, "常规"));
        //加泰罗尼亚语(西班牙)
        //ca-ES,Alba,ca-ES-AlbaNeural,Female
        //ca-ES,Enric,ca-ES-EnricNeural,Male
        //ca-ES,Joana,ca-ES-JoanaNeural,Female
        actors.add(new TtsActor("ca-ES-AlbaNeural", true, "常规"));
        actors.add(new TtsActor("ca-ES-JoanaNeural", true, "常规"));
        actors.add(new TtsActor("ca-ES-EnricNeural", false, "常规"));
        //克罗地亚语（克罗地亚)
        //hr-HR,Gabrijela,hr-HR-GabrijelaNeural,Female
        //hr-HR,Srećko,hr-HR-SreckoNeural,Male
        actors.add(new TtsActor("hr-HR-GabrijelaNeural", true, "常规"));
        actors.add(new TtsActor("hr-HR-SreckoNeural", false, "常规"));
        //捷克语（捷克)
        //cs-CZ,Antonín,cs-CZ-AntoninNeural,Male
        //cs-CZ,Vlasta,cs-CZ-VlastaNeural,Female
        actors.add(new TtsActor("cs-CZ-VlastaNeural", true, "常规"));
        actors.add(new TtsActor("cs-CZ-AntoninNeural", false, "常规"));
        //丹麦语（丹麦)
        //da-DK,Christel,da-DK-ChristelNeural,Female
        //da-DK,Jeppe,da-DK-JeppeNeural,Male
        actors.add(new TtsActor("da-DK-ChristelNeural", true, "常规"));
        actors.add(new TtsActor("da-DK-JeppeNeural", false, "常规"));
        //荷兰语（比利时）
        //nl-BE,Arnaud,nl-BE-ArnaudNeural,Male
        //nl-BE,Dena,nl-BE-DenaNeural,Female
        actors.add(new TtsActor("nl-BE-DenaNeural", true, "常规"));
        actors.add(new TtsActor("nl-BE-ArnaudNeural", false, "常规"));
        //荷兰语（荷兰）
        //nl-NL,Colette,nl-NL-ColetteNeural,Female
        //nl-NL,Fenna,nl-NL-FennaNeural,Female
        //nl-NL,Maarten,nl-NL-MaartenNeural,Male
        actors.add(new TtsActor("nl-NL-ColetteNeural", true, "常规"));
        actors.add(new TtsActor("nl-NL-FennaNeural", true, "常规"));
        actors.add(new TtsActor("nl-NL-MaartenNeural", false, "常规"));


        //爱沙尼亚语(爱沙尼亚)
        //et-EE,Anu,et-EE-AnuNeural,Female
        //et-EE,Kert,et-EE-KertNeural,Male
        actors.add(new TtsActor("et-EE-AnuNeural", true, "常规"));
        actors.add(new TtsActor("et-EE-KertNeural", false, "常规"));
        //芬兰语（芬兰）
        //fi-FI,Harri,fi-FI-HarriNeural,Male
        //fi-FI,Noora,fi-FI-NooraNeural,Female
        //fi-FI,Selma,fi-FI-SelmaNeural,Female
        actors.add(new TtsActor("fi-FI-NooraNeural", true, "常规"));
        actors.add(new TtsActor("fi-FI-SelmaNeural", true, "常规"));
        actors.add(new TtsActor("fi-FI-HarriNeural", false, "常规"));
        //法语（比利时）
        //fr-BE,Charline,fr-BE-CharlineNeural,Female
        //fr-BE,Gerard,fr-BE-GerardNeural,Male
        actors.add(new TtsActor("fr-BE-CharlineNeural", true, "常规"));
        actors.add(new TtsActor("fr-BE-GerardNeural", false, "常规"));
        //法语（加拿大）
        //fr-CA,Antoine,fr-CA-AntoineNeural,Male
        //fr-CA,Jean,fr-CA-JeanNeural,Male
        //fr-CA,Sylvie,fr-CA-SylvieNeural,Female
        actors.add(new TtsActor("fr-CA-SylvieNeural", true, "常规"));
        actors.add(new TtsActor("fr-CA-AntoineNeural", false, "常规"));
        actors.add(new TtsActor("fr-CA-JeanNeural", false, "常规"));
        //法语（法国）
        //fr-FR,Denise,fr-FR-DeniseNeural,Female
        //fr-FR,Henri,fr-FR-HenriNeural,Male
        actors.add(new TtsActor("fr-FR-DeniseNeural", true, "常规"));
        actors.add(new TtsActor("fr-FR-HenriNeural", false, "常规"));
        //法语（瑞士）
        //fr-CH,Ariane,fr-CH-ArianeNeural,Female
        //fr-CH,Fabrice,fr-CH-FabriceNeural,Male
        actors.add(new TtsActor("fr-CH-ArianeNeural", true, "常规"));
        actors.add(new TtsActor("fr-CH-FabriceNeural", false, "常规"));
        //德语（奥地利）
        //de-AT,Ingrid,de-AT-IngridNeural,Female
        //de-AT,Jonas,de-AT-JonasNeural,Male
        actors.add(new TtsActor("de-AT-IngridNeural", true, "常规"));
        actors.add(new TtsActor("de-AT-JonasNeural", false, "常规"));
        //德语（德国）
        //de-DE,Conrad,de-DE-ConradNeural,Male
        //de-DE,Katja,de-DE-KatjaNeural,Female
        actors.add(new TtsActor("de-DE-KatjaNeural", true, "常规"));
        actors.add(new TtsActor("de-DE-ConradNeural", false, "常规"));
        //德语（瑞士）
        //de-CH,Jan,de-CH-JanNeural,Male
        //de-CH,Leni,de-CH-LeniNeural,Female
        actors.add(new TtsActor("de-CH-LeniNeural", true, "常规"));
        actors.add(new TtsActor("de-DE-ConradNeural", false, "常规"));
        //希腊语(希腊)
        //el-GR,Αθηνά,el-GR-AthinaNeural,Female
        //el-GR,Νέστορας,el-GR-NestorasNeural,Male
        actors.add(new TtsActor("el-GR-AthinaNeural", true, "常规"));
        actors.add(new TtsActor("el-GR-NestorasNeural", false, "常规"));
        //希伯来语（以色列）
        //he-IL,אברי,he-IL-AvriNeural,Male
        //he-IL,הילה,he-IL-HilaNeural,Female
        actors.add(new TtsActor("he-IL-HilaNeural", true, "常规"));
        actors.add(new TtsActor("he-IL-AvriNeural", false, "常规"));
        //印地语（印度）
        //hi-IN,मधुर,hi-IN-MadhurNeural,Male
        //hi-IN,स्वरा,hi-IN-SwaraNeural,Female
        actors.add(new TtsActor("hi-IN-SwaraNeural", true, "常规"));
        actors.add(new TtsActor("hi-IN-MadhurNeural", false, "常规"));
        //匈牙利语(匈牙利)
        //hu-HU,Noémi,hu-HU-NoemiNeural,Female
        //hu-HU,Tamás,hu-HU-TamasNeural,Male
        actors.add(new TtsActor("hu-HU-NoemiNeural", true, "常规"));
        actors.add(new TtsActor("hu-HU-TamasNeural", false, "常规"));
        //印度尼西亚语(印度尼西亚)
        //id-ID,Ardi,id-ID-ArdiNeural,Male
        //id-ID,Gadis,id-ID-GadisNeural,Female
        actors.add(new TtsActor("id-ID-GadisNeural", true, "常规"));
        actors.add(new TtsActor("id-ID-ArdiNeural", false, "常规"));
        //爱尔兰语（爱尔兰）
        //ga-IE,Colm,ga-IE-ColmNeural,Male
        //ga-IE,Orla,ga-IE-OrlaNeural,Female
        actors.add(new TtsActor("ga-IE-OrlaNeural", true, "常规"));
        actors.add(new TtsActor("ga-IE-ColmNeural", false, "常规"));
        //意大利语（意大利）
        //it-IT,Diego,it-IT-DiegoNeural,Male
        //it-IT,Elsa,it-IT-ElsaNeural,Female
        //it-IT,Isabella,it-IT-IsabellaNeural,Female
        actors.add(new TtsActor("it-IT-ElsaNeural", true, "常规"));
        actors.add(new TtsActor("it-IT-IsabellaNeural", true, "常规"));
        actors.add(new TtsActor("it-IT-DiegoNeural", false, "常规"));

        //拉脱维亚语(拉脱维亚)
        //lv-LV,Everita,lv-LV-EveritaNeural,Female
        //lv-LV,Nils,lv-LV-NilsNeural,Male
        actors.add(new TtsActor("lv-LV-EveritaNeural", true, "常规"));
        actors.add(new TtsActor("lv-LV-NilsNeural", false, "常规"));
        //立陶宛语(立陶宛)
        //lt-LT,Leonas,lt-LT-LeonasNeural,Male
        //lt-LT,Ona,lt-LT-OnaNeural,Female
        actors.add(new TtsActor("lt-LT-OnaNeural", true, "常规"));
        actors.add(new TtsActor("lt-LT-LeonasNeural", false, "常规"));
        //马来语（马来西亚）
        //ms-MY,Osman,ms-MY-OsmanNeural,Male
        //ms-MY,Yasmin,ms-MY-YasminNeural,Female
        actors.add(new TtsActor("ms-MY-YasminNeural", true, "常规"));
        actors.add(new TtsActor("ms-MY-OsmanNeural", false, "常规"));
        //马耳他语（马耳他）
        //mt-MT,Grace,mt-MT-GraceNeural,Female
        //mt-MT,Joseph,mt-MT-JosephNeural,Male
        actors.add(new TtsActor("mt-MT-GraceNeural", true, "常规"));
        actors.add(new TtsActor("mt-MT-JosephNeural", false, "常规"));
        //挪威语（博克马尔语，挪威）
        //nb-NO,Finn,nb-NO-FinnNeural,Male
        //nb-NO,Iselin,nb-NO-IselinNeural,Female
        //nb-NO,Pernille,nb-NO-PernilleNeural,Female
        actors.add(new TtsActor("nb-NO-IselinNeural", true, "常规"));
        actors.add(new TtsActor("nb-NO-PernilleNeural", true, "常规"));
        actors.add(new TtsActor("nb-NO-FinnNeural", false, "常规"));
        //波兰语（波兰）
        //pl-PL,Agnieszka,pl-PL-AgnieszkaNeural,Female
        //pl-PL,Marek,pl-PL-MarekNeural,Male
        //pl-PL,Zofia,pl-PL-ZofiaNeural,Female
        actors.add(new TtsActor("pl-PL-AgnieszkaNeural", true, "常规"));
        actors.add(new TtsActor("pl-PL-MarekNeural", true, "常规"));
        actors.add(new TtsActor("pl-PL-MarekNeural", false, "常规"));
        //葡萄牙语（巴西）
        //pt-BR,Antônio,pt-BR-AntonioNeural,Male
        //pt-BR,Francisca,pt-BR-FranciscaNeural,Female
        actors.add(new TtsActor("pt-BR-FranciscaNeural", true, "常规，使用 SSML 提供多种语音风格"));
        actors.add(new TtsActor("pt-BR-AntonioNeural", false, "常规"));
        //葡萄牙语(葡萄牙)
        //pt-PT,Duarte,pt-PT-DuarteNeural,Male
        //pt-PT,Fernanda,pt-PT-FernandaNeural,Female
        //pt-PT,Raquel,pt-PT-RaquelNeural,Female
        actors.add(new TtsActor("pt-PT-FernandaNeural", true, "常规"));
        actors.add(new TtsActor("pt-PT-RaquelNeural", true, "常规"));
        actors.add(new TtsActor("pt-PT-DuarteNeural", false, "常规"));
        //罗马尼亚语(罗马尼亚)
        //ro-RO,Alina,ro-RO-AlinaNeural,Female
        //ro-RO,Emil,ro-RO-EmilNeural,Male
        actors.add(new TtsActor("ro-RO-AlinaNeural", true, "常规"));
        actors.add(new TtsActor("ro-RO-EmilNeural", false, "常规"));

        //斯洛伐克语(斯洛伐克)
        //sk-SK,Lukáš,sk-SK-LukasNeural,Male
        //sk-SK,Viktória,sk-SK-ViktoriaNeural,Female
        actors.add(new TtsActor("sk-SK-ViktoriaNeural", true, "常规"));
        actors.add(new TtsActor("sk-SK-LukasNeural", false, "常规"));
        //斯洛文尼亚语(斯洛文尼亚)
        //sl-SI,Petra,sl-SI-PetraNeural,Female
        //sl-SI,Rok,sl-SI-RokNeural,Male
        actors.add(new TtsActor("sl-SI-PetraNeural", true, "常规"));
        actors.add(new TtsActor("sl-SI-RokNeural", false, "常规"));
        //西班牙语（墨西哥）
        //es-MX,Dalia,es-MX-DaliaNeural,Female
        //es-MX,Jorge,es-MX-JorgeNeural,Male
        actors.add(new TtsActor("es-MX-DaliaNeural", true, "常规"));
        actors.add(new TtsActor("es-MX-JorgeNeural", false, "常规"));
        //西班牙语(西班牙)
        //es-ES,Elvira,es-ES-ElviraNeural,Female
        //es-ES,Álvaro,es-ES-AlvaroNeural,Male
        actors.add(new TtsActor("es-ES-ElviraNeural", true, "常规"));
        actors.add(new TtsActor("es-ES-AlvaroNeural", false, "常规"));
        //西班牙语（美国）
        //es-US,Alonso,es-US-AlonsoNeural,Male
        //es-US,Paloma,es-US-PalomaNeural,Female
        actors.add(new TtsActor("es-US-AlonsoNeural", true, "常规"));
        actors.add(new TtsActor("es-US-PalomaNeural", false, "常规"));
        //西班牙语（阿根廷）
        //es-AR,Elena,es-AR-ElenaNeural,Female
        //es-AR,Tomas,es-AR-TomasNeural,Male
        actors.add(new TtsActor("es-AR-ElenaNeural", true, "常规"));
        actors.add(new TtsActor("es-AR-TomasNeural", false, "常规"));
        //西班牙语（哥伦比亚）
        //es-CO,Gonzalo,es-CO-GonzaloNeural,Male
        //es-CO,Salome,es-CO-SalomeNeural,Female
        actors.add(new TtsActor("es-CO-SalomeNeural", true, "常规"));
        actors.add(new TtsActor("es-CO-GonzaloNeural", false, "常规"));
        //瑞典语（瑞典）
        //sv-SE,Hillevi,sv-SE-HilleviNeural,Female
        //sv-SE,Mattias,sv-SE-MattiasNeural,Male
        //sv-SE,Sofie,sv-SE-SofieNeural,Female
        actors.add(new TtsActor("sv-SE-HilleviNeural", true, "常规"));
        actors.add(new TtsActor("sv-SE-SofieNeural", true, "常规"));
        actors.add(new TtsActor("sv-SE-MattiasNeural", false, "常规"));
        //泰米尔语（印度）
        //ta-IN,பல்லவி,ta-IN-PallaviNeural,Female
        //ta-IN,வள்ளுவர்,ta-IN-ValluvarNeural,Male
        actors.add(new TtsActor("ta-IN-PallaviNeural", true, "常规"));
        actors.add(new TtsActor("ta-IN-ValluvarNeural", false, "常规"));
        //古吉拉特语（印度）
        //gu-IN,ધ્વની,gu-IN-DhwaniNeural,Female
        //gu-IN,નિરંજન,gu-IN-NiranjanNeural,Male
        actors.add(new TtsActor("gu-IN-DhwaniNeural", true, "常规"));
        actors.add(new TtsActor("gu-IN-NiranjanNeural", false, "常规"));
        //泰卢固语（印度）
        //te-IN,మోహన్,te-IN-MohanNeural,Male
        //te-IN,శ్రుతి,te-IN-ShrutiNeural,Female
        actors.add(new TtsActor("te-IN-ShrutiNeural", true, "常规"));
        actors.add(new TtsActor("te-IN-MohanNeural", false, "常规"));
        //马拉地语（印度）
        //mr-IN,आरोही,mr-IN-AarohiNeural,Female
        //mr-IN,मनोहर,mr-IN-ManoharNeural,Male
        actors.add(new TtsActor("mr-IN-AarohiNeural", true, "常规"));
        actors.add(new TtsActor("mr-IN-ManoharNeural", false, "常规"));
        //泰语（泰国）
        //th-TH,นิวัฒน์,th-TH-NiwatNeural,Male
        //th-TH,อัจฉรา,th-TH-AcharaNeural,Female
        //th-TH,เปรมวดี,th-TH-PremwadeeNeural,Female
        actors.add(new TtsActor("th-TH-AcharaNeural", true, "常规"));
        actors.add(new TtsActor("th-TH-PremwadeeNeural", true, "常规"));
        actors.add(new TtsActor("th-TH-NiwatNeural", false, "常规"));
        //土耳其语（土耳其）
        //tr-TR,Ahmet,tr-TR-AhmetNeural,Male
        //tr-TR,Emel,tr-TR-EmelNeural,Female
        actors.add(new TtsActor("tr-TR-EmelNeural", true, "常规"));
        actors.add(new TtsActor("tr-TR-AhmetNeural", false, "常规"));
        //乌克兰语(乌克兰)
        //uk-UA,Остап,uk-UA-OstapNeural,Male
        //uk-UA,Поліна,uk-UA-PolinaNeural,Female
        actors.add(new TtsActor("uk-UA-PolinaNeural", true, "常规"));
        actors.add(new TtsActor("uk-UA-OstapNeural", false, "常规"));
        //乌尔都语（巴基斯坦）
        //ur-PK,اسد,ur-PK-AsadNeural,Male
        //ur-PK,عظمیٰ,ur-PK-UzmaNeural,Female
        actors.add(new TtsActor("ur-PK-UzmaNeural", true, "常规"));
        actors.add(new TtsActor("ur-PK-AsadNeural", false, "常规"));
        //越南语(越南)
        //vi-VN,Hoài My,vi-VN-HoaiMyNeural,Female
        //vi-VN,Nam Minh,vi-VN-NamMinhNeural,Male
        actors.add(new TtsActor("vi-VN-HoaiMyNeural", true, "常规"));
        actors.add(new TtsActor("vi-VN-NamMinhNeural", false, "常规"));
        //威尔士语（英国）
        //cy-GB,Aled,cy-GB-AledNeural,Male
        //cy-GB,Nia,cy-GB-NiaNeural,Female
        actors.add(new TtsActor("cy-GB-NiaNeural", true, "常规"));
        actors.add(new TtsActor("cy-GB-AledNeural", false, "常规"));
        //立陶宛语（立陶宛）
        //lt-LT,Leonas,lt-LT-LeonasNeural,Male
        //lt-LT,Ona,lt-LT-OnaNeural,Female
        actors.add(new TtsActor("lt-LT-OnaNeural", true, "常规"));
        actors.add(new TtsActor("lt-LT-LeonasNeural", false, "常规"));
        //斯瓦希里语（肯尼亚）
        //sw-KE,Rafiki,sw-KE-RafikiNeural,Male
        //sw-KE,Zuri,sw-KE-ZuriNeural,Female
        actors.add(new TtsActor("sw-KE-ZuriNeural", true, "常规"));
        actors.add(new TtsActor("sw-KE-RafikiNeural", false, "常规"));
        Log.d(TAG, actors.size() + "");


    }

    public List<TtsActor> sortByLocale(List<TtsActor> list, Locale locale) {
        Collections.sort(list, (o1, o2) -> {
            Locale loc1 = o1.getLocale();
            Locale loc2 = o2.getLocale();
            boolean b11 = loc1.getISO3Language().equals(locale.getISO3Language());
            boolean b12 = loc1.getISO3Country().equals(locale.getISO3Country());
            boolean b13 = loc1.getDisplayVariant(Locale.US).equals(locale.getDisplayVariant(Locale.US));
            boolean b21 = loc2.getISO3Language().equals(locale.getISO3Language());
            boolean b22 = loc2.getISO3Country().equals(locale.getISO3Country());
            boolean b23 = loc2.getDisplayVariant(Locale.US).equals(locale.getDisplayVariant(Locale.US));
            //语言不同
            if ((!b11) && (!b21)) {
                return 0;
            }
            //两个都相同
            if (b11 && b12 && b13 == b21 && b22 && b23) {
                return 0;
            }
            if (b11 && b12 && b13) {
                return -1;
            }
            if (b21 && b22 && b23) {
                return 1;
            }

            if ((b11 && b12 == b21 && b22)) {
                if (b13 == b23) {
                    return 0;
                }
                if (b13) {
                    return -1;
                } else {
                    return 1;
                }
            }
            if (b11 && b12) {
                return -1;
            }
            if (b21 && b22) {
                return 1;
            }
            return 0;
        });
        return list;
    }

    /**
     * 获取所有Actor
     *
     * @return List<TtsActor>
     */
    @SuppressWarnings("unused")
    public synchronized List<TtsActor> getActors() {
        return sortByLocale(this.actors, Locale.getDefault());
        //return this.actors;
    }

    /**
     * 获取当前Locale支持的Actor
     *
     * @param locale locale
     * @return List<TtsActor>
     */
    @SuppressWarnings("unused")
    public List<TtsActor> getActorsByLocale(Locale locale) {
        List<TtsActor> newActors = new ArrayList<>();
        for (TtsActor actor : actors) {
            //语言相同或者地区相同
            if (actor.getLocale().getISO3Language().equals(locale.getISO3Language()) || actor.getLocale().getISO3Country().equals(locale.getISO3Country())) {
                newActors.add(actor);
            }
        }
        sortByLocale(newActors, locale);
        return newActors;
    }

//    public List<Locale> getAllSupportIOS() {
//


}
