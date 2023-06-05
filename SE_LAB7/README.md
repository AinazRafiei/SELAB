<div dir="rtl">
بسم الله الرحمن الرحیم

## گزارش بخش عملی 
این قسمت شامل سه بخش میباشد.
### بخش اول برنامه نویسی به روش TDD
در این بخش باتوجه به متدولوژی TDD ابتدا توابع تست پیاده سازی شده و پس از آن توابع و کلاس های مربوطه ایجاد شده اند.
در عکس زیر کلاس تست پیش از نوشته شدن کلاس ها مشخص میباشد.

![photo_2023-05-06_00-02-46](https://user-images.githubusercontent.com/58518166/236563482-01254fa4-c528-433d-946e-dfdce4e3460f.jpg)

### بخش دوم گسترش برنامه با توابع set و get
در این بخش، باتوجه به کاپایل ارور ها و ارور های زمان اجرا کلاس ایجاد شده و پس از توابع set و get برای کلاس ایجاد شده نوشته شده است.

### بخش سوم اضافه کردن مربع و ارث بری
در این بخش باتوجه به محدودیت ها و شرایط اولیه مربع و مستطیل، کلاس مربع را به عنوان پدر در نظر گرفته و آنرا پیاده سازی کردیم، سپس کلاس مستطیل را از آن ارث بری کرده و توابع و حالات خاص را در آن اصلاح یا تکمیل کردیم.

## پاسخ به سوالات تئوری 

۱- هریک از ۵ اصول solid را در یک الی دو خط توضیح دهید.
  جواب
  SOLID مجموعه ای از پنج اصل برای نوشتن کد شی گرا با کیفیت بالا و قابل نگهداری است:

Single Responsibility Principle
(SRP) : یک کلاس باید تنها یک دلیل برای تغییر داشته باشد، به این معنی که باید فقط یک مسئولیت یا کار انجام دهد.

Open-Closed Principle
(OCP): موجودیت های نرم افزار باید برای توسعه باز باشند اما برای اصلاح بسته باشند، به این معنی که رفتار نرم افزار باید بدون تغییر کد موجود قابل گسترش باشد.

Liskov Substitution Principle
(LSP): انواع فرعی باید برای انواع پایه خود قابل تعویض باشند، به این معنی که هر شی از یک کلاس پایه باید بتواند با یک شی از یک زیر کلاس بدون ایجاد مشکل جایگزین شود.

Interface Segregation Principle
(ISP): یک کلاینت نباید مجبور به پیاده سازی واسط هایی شود که از آنها استفاده نمی کند، به این معنی که رابط ها باید به گونه ای طراحی شوند که خاص نیازهای مشتریانشان باشد.

Dependency Inversion Principle
(DIP): ماژول های سطح بالا نباید به ماژول های سطح پایین وابسته باشند، اما هر دو باید به انتزاع ها بستگی داشته باشند. انتزاع ها نباید به جزئیات بستگی داشته باشند، بلکه جزئیات باید به انتزاع ها بستگی داشته باشند.



۲-اصول SOLID در کدام یک از گام‌های اصلی ایجاد نرم‌افزار (تحلیل نیازمندی‌ها، طراحی، پیاده‌سازی، تست و استقرار) استفاده می‌شوند؟ توضیح دهید.
<br />
جواب
<br />
اصول SOLID اصولاً در مراحل طراحی و پیاده سازی توسعه نرم افزار استفاده می شود.
در طول مرحله طراحی، اصول SOLID به ایجاد یک معماری نرم افزاری کمک می کند که ماژولار، قابل توسعه و نگهداری آسان باشد. با طراحی کلاس هایی که از اصول SOLID پیروی می کنند، توسعه دهندگان می توانند اطمینان حاصل کنند که کد آنها به اندازه کافی انعطاف پذیر است تا تغییرات و اضافات را بدون ایجاد اختلالات اساسی در سیستم تطبیق دهد.
در مرحله پیاده سازی، اصول SOLID توسعه دهندگان را در نوشتن کدی که متمرکز، قابل نگهداری و درک آسان باشد، راهنمایی می کند. با پیروی از اصول SOLID، توسعه‌دهندگان می‌توانند کلاس‌هایی ایجاد کنند که هدف مشخص و مشخصی داشته باشند، آزمایش آن‌ها آسان باشد و با کلاس‌های دیگر به‌راحتی جفت شوند.
با این حال، اصول SOLID را می توان برای سایر مراحل توسعه نرم افزار نیز به کار برد تا اطمینان حاصل شود که نرم افزار از کیفیت بالایی برخوردار است، مانند آزمایش و استقرار. برای مثال، نوشتن تست‌های واحد که بر یک مسئولیت واحد تمرکز دارند، با اصل مسئولیت واحد همسو می‌شوند. اطمینان از اینکه تغییرات در پایگاه کد عملکرد موجود را نقض نمی کند، با اصل باز-بسته هماهنگ است. با بکارگیری اصول SOLID در طول چرخه عمر توسعه نرم افزار، توسعه دهندگان می توانند نرم افزاری ایجاد کنند که قوی، انعطاف پذیر و نگهداری آسان باشد.




۳-معمولاً گام تست در پایان روند ایجاد نرم‌افزار انجام می‌شود، اما در روش TDD تست‌نویسی پیش از پیاده‌سازی شروع می‌شود. آیا این دو مورد با هم تناقضی دارند؟ توضیح دهید.
<br />
جواب
<br />
رویکرد سنتی توسعه نرم افزار این است که ابتدا کد بنویسید و سپس در مراحل بعدی آن را آزمایش کنید. با این حال، در (Test-Driven Development(TDD، مرحله آزمایش از همان ابتدا در فرآیند توسعه یکپارچه شده است. این بدان معناست که توسعه دهندگان قبل از نوشتن کد پیاده سازی واقعی، تست های خودکار را می نویسند.
در نگاه اول، ممکن است متناقض به نظر برسد که TDD شامل نوشتن تست‌ها قبل از اجرا است در حالی که رویکرد سنتی شامل آزمایش در پایان فرآیند است. با این حال، لزوماً اینطور نیست.
در رویکرد سنتی، آزمایش اغلب به عنوان یک مرحله جداگانه دیده می شود که پس از نوشتن کد انجام می شود. این می تواند منجر به نوشتن کدهایی از سوی توسعه دهندگان شود که آزمایش آن دشوار است و یافتن و رفع اشکالات را دشوارتر می کند. علاوه بر این، اگر آزمایش ها به اندازه کافی جامع نباشند، ممکن است اشکالات تا مرحله آزمایش مورد توجه قرار نگیرند، که رفع آن هم زمان بر و هم پرهزینه است.
در TDD، ابتدا با نوشتن تست‌ها، توسعه‌دهندگان مجبور می‌شوند قبل از نوشتن کد به این فکر کنند که چگونه باید طراحی شود و چگونه باید رفتار کند. این می تواند منجر به کدهایی شود که ماژولارتر هستند، آزمایش آنها آسان تر است و کمتر مستعد خطا هستند. علاوه بر این، از آنجایی که تست‌ها قبل از کد نوشته می‌شوند، به عنوان شکلی از مستندات عمل می‌کنند و می‌توانند به اطمینان از مطابقت کد با الزامات کمک کنند.
به طور خلاصه، در حالی که TDD شامل نوشتن تست‌ها قبل از پیاده‌سازی می‌شود، با رویکرد سنتی آزمایش در پایان فرآیند مغایرتی ندارد. TDD به سادگی آزمایش را از همان ابتدا در فرآیند توسعه ادغام می کند، و در نتیجه کدی ماژولارتر، آزمایش آسان تر و کمتر مستعد خطا است.


۴-فرض کنید در آزمایش بالا نیازی به تغییر ابعاد مستطیل نداشتیم. در این حالت طراحی مدل‌ها چه تفاوتی می‌کند؟
<br />
جواب
<br />
به دلیل استفاده از ابعاد مستطیل در functionalty مختلف مثل محاسبه مساحت،
حتی اگر نیازی به تغییر ابعاد مستطیل نداشتیم، طراحی مدل ها تفاوت چندانی ایجاد نمی کرد. با این حال، اگر در آینده نیاز به تغییر ابعاد داشتیم، داشتن متدهای set و get این کار را بدون نیاز به تغییر کدی که از آبجکت Rectangle یا Square استفاده می‌کند، آسان‌تر می‌کند. علاوه بر این، داشتن یک کلاس Square مجزا به ما این امکان را می‌دهد که روش‌ها یا رفتار مخصوص مربع‌ها را بدون تأثیر بر مستطیل اضافه کنیم زیرا pre condition و post condition های آنها این امکان را به ما میدهند.
</div>